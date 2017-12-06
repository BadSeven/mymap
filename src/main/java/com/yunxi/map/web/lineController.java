package com.yunxi.map.web;

import com.yunxi.map.entity.line;
import com.yunxi.map.service.lineService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by MyPC on 2017/12/5.
 */

@RestController
@RequestMapping("/line")
@MapperScan("com.yunxi.map.dao")
public class lineController {

    @Autowired
    private lineService service;



    /***
     * 获取全部线路
     * @return
     */
    @ApiOperation(value = "获取全部线路",notes = "获取全部的线路")
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public HashMap getAll() {
        HashMap retMap = new HashMap();
        ArrayList<line> list = new ArrayList();
        try{
            list = (ArrayList<line>) service.getAll();
            retMap.put("lines",list);
            retMap.put("msg","get line success");
            retMap.put("code",1);
        }catch (Exception e){
            e.printStackTrace();
            retMap.put("msg","get line fail");
            retMap.put("code",-1);
            retMap.put("res",e.getMessage());
        }
         return  retMap;
    }

    /***
     *
     * 添加一个线路
     * @param a1
     * @param b1
     * @param a2
     * @param b2
     * @param direction
     * @return
     */
    @ApiOperation(value = "添加一个线路",notes = "根据线路的其实点我结束点创建线路")
    @ApiImplicitParams({
            @ApiImplicitParam(name="a1",value = "起始点的经纬",required = true,dataType = "String",paramType="path"),
            @ApiImplicitParam(name="b1",value = "起始点的经纬",required = true,dataType = "String"),
            @ApiImplicitParam(name="a2",value = "终点点的经纬",required = true,dataType = "String"),
            @ApiImplicitParam(name="b2",value = "终点",required = true,dataType = "String"),
            @ApiImplicitParam(name="direction",value = "方向",required = true,dataType = "String")
    })
    @RequestMapping(value = "/addline/{a1}/{b1}/{a2}/{b2}/{direction}",method = RequestMethod.GET)
    public HashMap addline(@PathVariable String a1,
                           @PathVariable String b1,
                           @PathVariable String a2,
                           @PathVariable String b2,
                           @PathVariable int direction){
        HashMap retMap = new HashMap();
        try {
            service.addline(a1,b1,a2,b2,direction);
            retMap.put("msg","add line success");
            retMap.put("code",1);
            return retMap;
        }catch (Exception e){
            e.printStackTrace();
            retMap.put("msg","add line fail");
            retMap.put("code",-1);
            retMap.put("res",e.getMessage());
            return retMap;
        }
    }

    /**
     * 删除线路
     * @param id
     * @return
     */

    @ApiOperation(value = "删除一个线路",notes = "根据线路id删除线路")
    @ApiImplicitParam(name="id",value = "lineid",required = true,dataType = "int",paramType="path")
    @RequestMapping(value = "/deleteline/{id}",method = RequestMethod.GET)
    public HashMap deleteline(@PathVariable  int id){
        HashMap retMap = new HashMap();
        try{
            service.deleteline(id);
            retMap.put("msg","delete line success");
            retMap.put("code",1);
            return retMap;
        }catch (Exception e){
            retMap.put("msg","delete line fail");
            retMap.put("code",-1);
            retMap.put("res",e.getMessage());
            return retMap;
        }

    }
}

