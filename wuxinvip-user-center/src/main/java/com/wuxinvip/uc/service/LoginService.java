package com.wuxinvip.uc.service;

import com.wuxinvip.uc.model.User;

import java.util.ArrayList;

/**
 * Created by 无心 on 2017/11/29.
 */

public interface LoginService {

    ArrayList<User> listUser() throws InterruptedException;

}
