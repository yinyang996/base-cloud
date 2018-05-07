package com.wuxinvip.project.api.controller;


import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wuxinvip.project.api.client.ItemFeignService;
import com.wuxinvip.project.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by 无心 on 2017/11/29.
 */
@RestController
@RequestMapping("project")
public class ItemController {

    @Autowired
    ItemFeignService itemFeignService;


    @RequestMapping("list")
    @Hystrix
    private ArrayList<Item> listItem(){
        return itemFeignService.listItem();
    }

}
