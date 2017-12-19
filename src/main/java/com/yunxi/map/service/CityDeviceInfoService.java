package com.yunxi.map.service;

import com.yunxi.map.dao.CityDeviceInfoMapper;
import com.yunxi.map.entity.CityDeviceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by MyPC on 2017/12/19.
 */
@Service
public class CityDeviceInfoService {

    @Autowired
    private CityDeviceInfoMapper mapper;

    public Object getall(){
       return mapper.getall();
    }
    @Transactional
    public void delinfo(int id){
        mapper.delinfo(id);
    }
    public Object getdeviceinfobyid(int id ){
        return mapper.getdeviceinfobyid(id);
    }
    @Transactional
    public void upateinfo(CityDeviceInfo cityDeviceInfo){
        mapper.upateinfo(cityDeviceInfo);
    }
    @Transactional
    public void addinfo(CityDeviceInfo cityDeviceInfo){
        mapper.addinfo(cityDeviceInfo);
    }




}
