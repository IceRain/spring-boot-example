package com.zzb.dao;

import com.zzb.mapper.UserMapper;
import com.zzb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by ThinkPad on 2017/2/22.
 */
@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
      return   userMapper.findUserInfo();
    }
}
