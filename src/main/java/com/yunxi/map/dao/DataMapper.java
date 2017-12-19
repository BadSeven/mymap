package com.yunxi.map.dao;

import com.yunxi.map.entity.DataInfo;


import java.util.List;

/**
 * Created by MyPC on 2017/12/18.
 */
public interface DataMapper {

    public List<DataInfo> getAllDateInfo();

    public void delInfo(int infoid);

    public void updateinfo(DataInfo dataInfo);

    public DataInfo getinfobyid(int infoid);

    public void addinfo(DataInfo dataInfo);
}
