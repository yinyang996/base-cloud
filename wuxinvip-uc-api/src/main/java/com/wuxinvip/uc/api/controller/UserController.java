package com.wuxinvip.uc.api.controller;


import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wuxinvip.uc.api.client.UserFeignService;
import com.wuxinvip.uc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserFeignService userFeignService;


    @RequestMapping("list")
    @Hystrix
    private ArrayList<User> listItem(){
        return userFeignService.listUser();
    }

}
