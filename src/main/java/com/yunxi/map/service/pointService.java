package com.yunxi.map.service;

import com.yunxi.map.dao.LineMapper;
import com.yunxi.map.dao.PointMapper;
import com.yunxi.map.entity.Line;
import com.yunxi.map.entity.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

/**
 * Created by MyPC on 2017/12/7.
 */
@Service
public class pointService {
    @Autowired
    private PointMapper pointMapper;
    @Autowired
    private LineMapper lineMapper;
    /***
     * 获取全部的点
     * @return
     * @throws Exception
     */
    public List<Point> getAllPoint() throws Exception{
        return pointMapper.getAllPoint();
    }

    /**
     *添加一个点
     * @param point
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean addPoint(Point point) throws Exception{
        return pointMapper.addPoint(point);
    }

    /**
     * 删除一个节点
     * @param id
     * @return
     * @throws Exception
     */
    @Transactional
    public void deletePointById(int id) throws Exception{
        //1删除点 2 删除和点相关的线
        pointMapper.deletePointById(id);
        List<Line> list =  lineMapper.getLineByPointid(id);
        Iterator<Line> it = list.iterator();
        while (it.hasNext()){
            lineMapper.deleteLine(it.next().getId());
        }
    }

    /**
     * 更新点的信息
     * @param point
     * @return
     * @throws Exception
     */
    public boolean updatePoint(Point point) throws Exception{
        return pointMapper.updatePoint(point);
    }

}
