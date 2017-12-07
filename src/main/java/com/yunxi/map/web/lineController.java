package com.yunxi.map.web;



import com.yunxi.map.entity.Line;
import com.yunxi.map.service.lineService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


/**
 * Created by MyPC on 2017/12/5.
 */

@RestController
public class lineController {

    @Autowired
    private lineService service;



    /***
     * 获取全部线路
     * @return
     */
    @ApiOperation(value = "获取全部线路",notes = "获取全部的线路信息")
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public HashMap getAllLine() {
        HashMap retMap = new HashMap();

        try{
            retMap.put("lines",service.getAllLine());
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

    /**
     * 添加线路
     * @param sid
     * @param eid
     * @param direction
     * @param description
     * @param distance
     * @return
     */
    @ApiOperation(value = "添加一个线路",notes = "根据线路的a，b点创建线路 ab 点的来源可以做成一个在添加页面 有一个下来选则框的属性")
    @ApiImplicitParams({
            @ApiImplicitParam(name="sid",value = "a点id",required = true,dataType = "String"),
            @ApiImplicitParam(name="eid",value = "b点id",required = true,dataType = "String"),
            @ApiImplicitParam(name="name",value = "线路的名称",required = true,dataType = "String"),
            @ApiImplicitParam(name="direction",value = "方向（0:a-b 1:b-a）",required = true,dataType = "int"),
            @ApiImplicitParam(name="description",value = "描述线路信息（长度 什么专线之类的）",required = true,dataType = "String"),
            @ApiImplicitParam(name="distance",value = "距离等信息",required = true,dataType = "String")
    })
    @RequestMapping(value = "/addline/{sid}/{eid}/{name}/{direction}/{description}/{distance}",method = RequestMethod.GET)
    public HashMap addline(@PathVariable int sid,
                           @PathVariable int eid,
                           @PathVariable String name,
                           @PathVariable int direction,
                           @PathVariable String description,
                           @PathVariable String distance){
        HashMap retMap = new HashMap();
        try {
            Line line = new Line();
            line.setEid(eid);
            line.setSid(sid);
            line.setName(name);
            line.setDirection(direction);
            line.setDescription(description);
            line.setDistance(distance);
            service.addLine(line);
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
            service.deleteLine(id);
            retMap.put("msg","delete line success");
            retMap.put("code",1);
            return retMap;
        }catch (Exception e){
            retMap.put("msg","delete line fail");
            retMap.put("code",0);
            retMap.put("res",e.getMessage());
            return retMap;
        }
    }

    /**
     *
     * @param sid
     * @param eid
     * @param direction
     * @param description
     * @param distance
     * @return
     */
    @ApiOperation(value = "更新线路",notes = "=更新line的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="sid",value = "a点id",required = false,dataType = "int"),
            @ApiImplicitParam(name="eid",value = "b点id",required = false,dataType = "int"),
            @ApiImplicitParam(name="direction",value = "方向（0:a-b 1:b-a）",required = false,dataType = "int"),
            @ApiImplicitParam(name="description",value = "描述线路信息（长度 什么专线之类的）",required = false,dataType = "String"),
            @ApiImplicitParam(name="distance",value = "距离等信息",required = false,dataType = "double")
    })
    @GetMapping("/updateline/{sid}/{eid}/{direction}/{description}/{distance}")
    public  HashMap updateline(@PathVariable int sid,
                               @PathVariable int eid,
                               @PathVariable int direction,
                               @PathVariable String description,
                               @PathVariable String distance){

        HashMap retMap = new HashMap();
        try {
            Line line = new Line();
            line.setEid(eid);
            line.setSid(sid);
            line.setDistance(distance);
            line.setDescription(description);
            line.setDirection(direction);
            service.updateLine(line);
            retMap.put("msg","success");
            retMap.put("code",1);
            return retMap;
        }catch (Exception e){
            e.printStackTrace();
            retMap.put("msg","fail");
            retMap.put("code",0);
            retMap.put("res",e.getMessage());
            return retMap;
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取一条线路",notes = "获取一条线路的信息")
    @ApiImplicitParam(value = "id",name = "线路id",required = false,dataType = "int")
    @RequestMapping(value = "/getline",method = RequestMethod.GET)
    public HashMap getLine(@PathVariable(name = "id",required = true) int id){

        HashMap retMap = new HashMap();
        try {
            retMap.put("line",service.getLine(id));
            retMap.put("msg","success");
            retMap.put("code",1);

        }catch (Exception e){
            e.printStackTrace();
            retMap.put("msg","fail");
            retMap.put("code",0);
            retMap.put("res",e.getMessage());

        }
      return retMap;
    }

    /***
     * 根据point id 获取线路
     * @param id
     * @return
     */
    @ApiOperation(value = "获取一条线路",notes = "通过pointid一条线路的信息")
    @ApiImplicitParam(value = "id",name = "节点id",required = false,dataType = "int")
    @RequestMapping(value = "/getlinebypointid",method = RequestMethod.GET)
    public HashMap getLineByPointid(@PathVariable(name = "id",required = true) int id){

        HashMap retMap = new HashMap();
        try {
            retMap.put("line",service.getLineByPointid(id));
            retMap.put("msg","success");
            retMap.put("code",1);
        }catch (Exception e){
            e.printStackTrace();
            retMap.put("msg","fail");
            retMap.put("code",0);
            retMap.put("res",e.getMessage());
        }
        return retMap;
    }

}

