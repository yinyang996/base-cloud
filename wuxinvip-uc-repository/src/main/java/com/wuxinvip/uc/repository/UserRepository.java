package com.wuxinvip.uc.repository;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wuxinvip.uc.model.User;
import com.wuxinvip.uc.repository.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserRepository {

    @Autowired
    UserDao userDao;

    @RequestMapping("list")
    @Hystrix
    private List<User> listUser(User user){
        return userDao.list(user);
    }

}
