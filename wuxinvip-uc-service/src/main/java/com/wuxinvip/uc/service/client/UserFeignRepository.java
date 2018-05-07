package com.wuxinvip.uc.service.client;


import com.wuxinvip.uc.model.User;
import com.wuxinvip.uc.service.client.impl.UserFeignRepositoryFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@FeignClient(name = "wuxinvip-project-repository",fallback = UserFeignRepositoryFallBack.class)
public interface UserFeignRepository {

    @RequestMapping("/user/list")
    List<User> listUser();

}
