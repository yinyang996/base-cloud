package com.wuxinvip.project.service.client.impl;

import com.wuxinvip.project.model.Item;
import com.wuxinvip.project.service.client.ItemFeignRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemFeignRepositoryFallBack implements ItemFeignRepository {

    private static final Logger logger = LoggerFactory.getLogger(ItemFeignRepositoryFallBack.class);


    @Override
    public List<Item> listItem() {
        logger.error("service-project-service feign listItem fallback 被调用 ");
        return null;
    }
}
