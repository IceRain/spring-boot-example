package com.zzb.service.impl;

import com.zzb.dao.UserDao;
import com.zzb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ThinkPad on 2017/2/22.
 */
@Service
public class IUserService {
    @Autowired
    private UserDao userDao;

    public User getUserinfo(){
      return   userDao.getUserInfo();
    }
}
