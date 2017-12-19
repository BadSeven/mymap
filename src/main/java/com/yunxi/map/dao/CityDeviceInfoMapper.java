package com.yunxi.map.dao;

import com.yunxi.map.entity.CityDeviceInfo;

/**
 * Created by MyPC on 2017/12/19.
 */
public interface CityDeviceInfoMapper {

    public Object getall();
    public void delinfo(int id);
    public Object getdeviceinfobyid(int id );
    public void upateinfo(CityDeviceInfo cityDeviceInfo);
    public void addinfo(CityDeviceInfo cityDeviceInfo);
}
