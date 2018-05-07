package com.wuxinvip.project.feign;

import com.wuxinvip.project.feign.impl.UserCenterFeignServiceFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 无心 on 2017/11/30.
 */
@FeignClient(name = "USER-CENTER",fallback = UserCenterFeignServiceFallBack.class)
public interface UserCenterFeignService {
    //调用服务提供者 controller
    @RequestMapping("/user/login")
    String login();
}
