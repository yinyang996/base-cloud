package com.wuxinvip.uc.mapper;

import com.wuxinvip.uc.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by 无心 on 2017/11/29.
 */
@Component
public interface LoginDao {

    ArrayList<User> listUser();

}
