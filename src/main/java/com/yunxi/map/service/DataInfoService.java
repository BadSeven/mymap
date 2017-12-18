package com.yunxi.map.service;

import com.yunxi.map.dao.DataMapper;
import com.yunxi.map.dao.LineMapper;
import com.yunxi.map.entity.DataInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MyPC on 2017/12/18.
 */
@Service
@MapperScan("com.yunxi.map.dao")
public class DataInfoService {


    @Autowired
    private DataMapper mapper;


    public List<DataInfo> getAllDateInfo()
    {
       return mapper.getAllDateInfo();
    }
}
