package com.wuxinvip.uc.service.client.impl;

import com.wuxinvip.uc.model.User;
import com.wuxinvip.uc.service.client.UserFeignRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFeignRepositoryFallBack implements UserFeignRepository {

    private static final Logger logger = LoggerFactory.getLogger(UserFeignRepositoryFallBack.class);


    @Override
    public List<User> listUser() {
        logger.error("service-uc-service feign listUser fallback 被调用 ");
        return null;
    }
}
