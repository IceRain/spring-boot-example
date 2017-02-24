package com.zzb.mapper;

import com.zzb.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ThinkPad on 2017/2/22.
 */
@Mapper
public interface UserMapper {
    public User findUserInfo();
}
