package com.wuxinvip.project.repository;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wuxinvip.project.model.Item;
import com.wuxinvip.project.repository.dao.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemRepository {

    @Autowired
    ItemDao itemDao;

    @RequestMapping("list")
    @Hystrix
    private List<Item> listItem(Item item){
        return itemDao.list(item);
    }

}
