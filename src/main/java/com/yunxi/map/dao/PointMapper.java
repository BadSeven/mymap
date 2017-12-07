package com.yunxi.map.dao;

import com.yunxi.map.entity.Point;

import java.util.List;


public interface PointMapper {
    /***
     * 获取全部的点
     * @return
     * @throws Exception
     */
    public List<Point> getAllPoint() throws Exception;

    /***
     *添加一个点
     * @param point
     * @return
     * @throws Exception
     */
    public boolean addPoint(Point point) throws Exception;

    /**
     * 根据id删除一个点
     * @param id
     * @return
     * @throws Exception
     */
    public boolean deletePointById(int id) throws Exception;

    /**
     * 更新一个点的信息
     * @param point
     * @return
     * @throws Exception
     */
    public boolean updatePoint(Point point) throws Exception;


}