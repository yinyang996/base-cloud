package com.wuxinvip.project.controller;

import com.wuxinvip.project.feign.UserCenterFeignService;
import com.wuxinvip.project.model.Item;
import com.wuxinvip.project.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * Created by 无心 on 2017/11/29.
 */
@RequestMapping("/")
@RestController
public class ItemController {

    @Autowired
    ItemService itemService;
    @RequestMapping("project/list")
    private ArrayList<Item> listItem(){
        return itemService.listItem();
    }


    @Autowired
    UserCenterFeignService userCenterFeignService;



    @RequestMapping("login")
    private String Login (){
        return userCenterFeignService.login();
//      return restTemplate.getForEntity("http://USER-CENTER/user/login",String.class).getBody();
    }

    @Autowired
    RestTemplate restTemplate;

    /**
     * 开启客户端负载均衡
     */
    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
