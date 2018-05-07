package com.wuxinvip.project.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wuxinvip.project.mapper.ItemDao;
import com.wuxinvip.project.model.Item;
import com.wuxinvip.project.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by 无心 on 2017/11/29.
 */
@Service
public class ItemServiceImpl implements ItemService {

    private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    ItemDao itemDao;


    @Override
    @HystrixCommand(fallbackMethod = "listItemFallBack")
    public ArrayList<Item> listItem() {
        int sleep = new Random().nextInt(3);
        try {
            TimeUnit.SECONDS.sleep(sleep); //触发熔断
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("随机休眠时间",sleep);
        return itemDao.listItem();
//        return null;
    }

    public ArrayList<Item> listItemFallBack() {
        return new ArrayList<>();
    }

}
