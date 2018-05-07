package com.wuxinvip.uc.feign;

import com.wuxinvip.uc.feign.impl.ItemFeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 无心 on 2017/11/30.
 */
//@Headers("Accept: application/json")
@FeignClient(value = "uc",fallback = ItemFeignServiceFallBack.class)
public interface ItemFeignService {
    //调用 service 端 controller
    @RequestMapping("/project/list")
    String listItem();

    /**
     * 带参调用方法
     * @RequestLine("POST /uc/login0")
     * @Headers("Content-type: application/json")
     * String example0(@RequestParam("id") String id);

     * @RequestLine("PUT /uc/login1")
     * @Headers("Content-type: application/json")
     * String example1(@RequestBody User uc);
     *
     */



}
