package com.yunxi.map.service;

import com.yunxi.map.dao.MapUserMapper;
import com.yunxi.map.entity.mapuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MyPC on 2017/12/19.
 */
@Service
public class mapUserService {


    @Autowired
    private MapUserMapper mapUserMapper;

    public mapuser login(mapuser user){
        return mapUserMapper.login(user);
    }

    public mapuser getUserByid(int id){
        return mapUserMapper.getUserByid(id);
    }

    public void registeredoradduser(mapuser user){
        mapUserMapper.registeredoradduser(user);
    }

    public void deluser(int id){
        mapUserMapper.deluser(id);
    }
    public void updateuser(mapuser user){
        mapUserMapper.updateuser(user);
    }


}
