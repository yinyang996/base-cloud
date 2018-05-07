package com.wuxinvip.project.api.client;

import com.wuxinvip.project.api.client.fallback.ItemFeignServiceFallBack;
import com.wuxinvip.project.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@FeignClient(name = "wuxinvip-project-service",fallback = ItemFeignServiceFallBack.class)
public interface ItemFeignService {

    @RequestMapping("/item/list")
    ArrayList<Item> listItem();

}
