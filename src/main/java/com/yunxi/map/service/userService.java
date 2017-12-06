package com.yunxi.map.service;

import com.yunxi.map.dao.UserMapper;
import com.yunxi.map.entity.mapUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MyPC on 2017/12/5.
 */
@Service
public class userService {

    @Autowired
    private UserMapper userMapper;

    public mapUser  getUserById(int id){

        mapUser user = new mapUser();
        user.setId(id);
        return userMapper.getUserById(user);
    }
}
