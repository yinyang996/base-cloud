package com.wuxinvip.project.service.client;


import com.wuxinvip.project.model.Item;
import com.wuxinvip.project.service.client.impl.ItemFeignRepositoryFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@FeignClient(name = "wuxinvip-project-repository",fallback = ItemFeignRepositoryFallBack.class)
public interface ItemFeignRepository {

    @RequestMapping("/item/list")
    List<Item> listItem();

}
