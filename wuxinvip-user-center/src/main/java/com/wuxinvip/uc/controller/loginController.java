package com.wuxinvip.uc.controller;

import com.wuxinvip.uc.model.User;
import com.wuxinvip.uc.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by 无心 on 2017/11/29.
 */
@RestController
@RequestMapping("user")
public class loginController {

    private static final Logger logger = LoggerFactory.getLogger(loginController.class);

    @Autowired
    LoginService loginService;
    @RequestMapping("list")
    private ArrayList<User> listUser()throws InterruptedException{
        return loginService.listUser();
    }



    /*
     *项目模块调用 controller
     */
    @RequestMapping("login")
    private String Login(){
        return "SUCCESS";
    }

//    @StreamListener()
//    private String message(){
//
//        return null;
//    }
}
