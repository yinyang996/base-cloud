package com.wuxinvip.uc.service;


import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wuxinvip.uc.model.User;
import com.wuxinvip.uc.service.client.UserFeignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserService {


    @Autowired
    UserFeignRepository userFeignRepository;
    @RequestMapping("list")
    @Hystrix
    public List<User> list(){
        return userFeignRepository.listUser();
    }

}
