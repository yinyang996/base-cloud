package com.wuxinvip.uc.api.client.fallback;

import com.wuxinvip.uc.api.client.UserFeignService;
import com.wuxinvip.uc.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserFeignServiceFallBack implements UserFeignService {

    private static final Logger logger = LoggerFactory.getLogger(UserFeignServiceFallBack.class);


    @Override
    public ArrayList<User> listUser() {
        logger.error("service-uc-api feign listUser fallback 被调用 ");
        return null;
    }
}
