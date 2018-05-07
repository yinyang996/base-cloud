package com.wuxinvip.uc.service.impl;

import com.wuxinvip.uc.mapper.LoginDao;
import com.wuxinvip.uc.model.User;
import com.wuxinvip.uc.service.LoginService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
public class LoginServiceImpl implements LoginService{


    private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    LoginDao loginDao;


    @Override
    @HystrixCommand(fallbackMethod = "listUserFallBack")
    public ArrayList<User> listUser() throws InterruptedException{
        int sleep = new Random().nextInt(3);
        TimeUnit.SECONDS.sleep(sleep); //触发熔断
        logger.info("随机休眠时间",sleep);
        return loginDao.listUser();
    }

    private ArrayList<User> listUserFallBack(){
        return  new ArrayList<>();
    }
}
