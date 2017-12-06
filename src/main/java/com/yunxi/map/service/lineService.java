package com.yunxi.map.service;

import com.yunxi.map.dao.LineMapper;
import com.yunxi.map.entity.line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MyPC on 2017/12/5.
 */
@Service
public class lineService {


    @Autowired
    private LineMapper lineMapper;

    /***
     *获取全部
     * @return
     * @throws Exception
     */
    public List<line> getAll() throws Exception{
       return lineMapper.getAll();
    }

    /***
     *
     * @param a1
     * @param b1
     * @param a2
     * @param b2
     * @param direction
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean addline(String a1,String b1,String a2,String b2,int direction) throws Exception{
        line arg = new line();
        arg.setLatitudeA(a1);
        arg.setLongitudeA(b1);
        arg.setLatitudeB(a2);
        arg.setLongitudeB(b2);
        arg.setDirection(direction);
        return lineMapper.addline(arg);
    }

    /***
     * 根据id删除一条数据
     * @param id
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean deleteline(int id) throws Exception{
        return lineMapper.deleteline(id);
    }

}
