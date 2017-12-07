package com.yunxi.map.service;

import com.yunxi.map.dao.LineMapper;

import com.yunxi.map.entity.Line;
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

    /**
     * 获取全部线路
     * @return
     * @throws Exception
     */
    public List<Line> getAllLine() throws Exception{
        return  lineMapper.getAllLine();
    }


    /**
     * 添加一个线路
     * @param line
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean addLine(Line line) throws Exception{
        return lineMapper.addLine(line);
    }

    /**
     * 更新一个线路
     * @param line
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean updateLine(Line line) throws Exception{
        return lineMapper.updateLine(line);

    }

    /***
     * 删除一个线路
     * @param id
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean deleteLine(int id) throws Exception{
        return lineMapper.deleteLine(id);
    }

    /**
     * 获取一个线路
     * @param id
     * @return
     * @throws Exception
     */
    public Line getLine(int id) throws Exception{
        return lineMapper.getLine(id);
    }

    /**
     * 根据点的id获取线路
     * @param id
     * @return
     * @throws Exception
     */
    @Transactional
    public List<Line> getLineByPointid(int id) throws Exception{
        return lineMapper.getLineByPointid(id);
    }
}
