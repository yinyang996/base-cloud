package com.wuxinvip.project.service;


import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wuxinvip.project.model.Item;
import com.wuxinvip.project.service.client.ItemFeignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemService {


    @Autowired
    ItemFeignRepository itemFeignRepository;
    @RequestMapping("list")
    @Hystrix
    public List<Item> list(){
        return itemFeignRepository.listItem();
    }

}
