package com.zzb.controller;

import com.zzb.model.User;
import com.zzb.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by ThinkPad on 2017/2/21.
 */

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    public User getUser(){
        return userService.getUserinfo();
    }

}
