package com.wuxinvip.project.feign.impl;

import com.wuxinvip.project.feign.UserCenterFeignService;
import org.springframework.stereotype.Component;

/**
 * Created by 无心 on 2017/11/30.
 */
@Component
public class UserCenterFeignServiceFallBack implements UserCenterFeignService {
    @Override
    public String login() {
        return "服务降级触发！";
    }
}
