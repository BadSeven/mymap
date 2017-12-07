package com.yunxi.map.dao;


import com.yunxi.map.entity.Line;

import java.util.List;

public interface LineMapper {

    /***
     *获取全部节点的信息
     * @return
     * @throws Exception
     */
    public List<Line> getAllLine() throws Exception;

    /**
     * 添加一个线路
     * @param line
     * @return
     * @throws Exception
     */
    public boolean addLine(Line line) throws Exception;

    /**
     * 更新一个线路
     * @param line
     * @return
     * @throws Exception
     */
    public boolean updateLine(Line line) throws Exception;

    /***
     * 删除一个线路
     * @param id
     * @return
     * @throws Exception
     */
    public boolean deleteLine(int id) throws Exception;

    /**
     * 获取一个线路
     * @param id
     * @return
     * @throws Exception
     */
    public Line getLine(int id) throws Exception;

    /**
     * 根据点的id获取线路
     * @param id
     * @return
     * @throws Exception
     */
    public List<Line> getLineByPointid(int id) throws Exception;



}