package com.wuxinvip.uc.api.client;

import com.wuxinvip.uc.api.client.fallback.UserFeignServiceFallBack;
import com.wuxinvip.uc.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@FeignClient(name = "wuxinvip-uc-service",fallback = UserFeignServiceFallBack.class)
public interface UserFeignService {

    @RequestMapping("/user/list")
    ArrayList<User> listUser();

}
