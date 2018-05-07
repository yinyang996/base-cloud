package com.wuxinvip.project.api.client.fallback;

import com.wuxinvip.project.api.client.ItemFeignService;
import com.wuxinvip.project.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ItemFeignServiceFallBack implements ItemFeignService {

    private static final Logger logger = LoggerFactory.getLogger(ItemFeignServiceFallBack.class);


    @Override
    public ArrayList<Item> listItem() {
        logger.error("service-project-api feign listItem fallback 被调用 ");
        return null;
    }
}
