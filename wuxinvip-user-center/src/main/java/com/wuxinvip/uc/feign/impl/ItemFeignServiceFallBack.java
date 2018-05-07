package com.wuxinvip.uc.feign.impl;

import com.wuxinvip.uc.feign.ItemFeignService;
import org.springframework.stereotype.Service;

/**
 * Created by 无心 on 2017/11/30.
 */
@Service
public class ItemFeignServiceFallBack implements ItemFeignService {
    @Override
    public String listItem() {
        return "服务降级触发！";
    }
}
