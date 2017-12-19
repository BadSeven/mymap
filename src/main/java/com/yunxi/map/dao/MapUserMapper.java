package com.yunxi.map.dao;

import com.yunxi.map.entity.mapuser;

/**
 * Created by MyPC on 2017/12/19.
 */
public interface MapUserMapper {

    public mapuser login(mapuser user);

    public mapuser getUserByid(int id);

    public void registeredoradduser(mapuser user);

    public void deluser(int id);

    public void updateuser(mapuser user);

}
