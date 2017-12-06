package com.yunxi.map.dao;

import com.yunxi.map.entity.line;

import java.util.List;

/**
 * Created by MyPC on 2017/12/5.
 */
public interface LineMapper {
    /***
     *获取全部线路
     * @return
     * @throws Exception
     */
    public List<line> getAll() throws Exception;

    /***
     * 添加线路
     * @param arg
     * @return
     * @throws Exception
     */
    public boolean addline(line arg) throws Exception;

    /**
     *删除一条线路
     * @param id
     * @return
     * @throws Exception
     */
    public boolean deleteline(int id) throws Exception;

    /**
     * 删除全部线
     * @return
     * @throws Exception
     */
    public boolean deleteallLie() throws Exception;
}
