package com.yunxi.map.web;

import com.yunxi.map.entity.Point;
import com.yunxi.map.service.pointService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by MyPC on 2017/12/7.
 */
@RestController
public class pointController {

    @Autowired
    private pointService  service;

    /**
     * 获取全部节点
     * @return
     */
    @ApiOperation(value = "获取所有点",notes = "获取所有点的数据信息")
    @GetMapping("/getallpoint")
    public HashMap getAllPoint(){
        HashMap retMap = new HashMap();
        try{
            retMap.put("Points",service.getAllPoint());
            retMap.put("code",1);
            retMap.put("msg","success");
        }catch (Exception e){
            retMap.put("err",e.getMessage());
            retMap.put("code",0);
            retMap.put("msg","fail");
        }
        return retMap;
    }

    /***
     * 添加一个节点
     * @param longitude
     * @param latitude
     * @param description
     * @return
     */
    @ApiOperation(value = "添加一个节点",notes = "添加节点信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="longitude",value = "精度",required = true,dataType = "String"),
            @ApiImplicitParam(name="latitude",value = "纬度",required = true,dataType = "String"),
            @ApiImplicitParam(name="description",value = "描述信息(机房信息，地点信息等)",required = true,dataType = "String")
    })
    @GetMapping("/addpoint/{longitude}/{latitude}/{description}")
    public  HashMap addPoint(@PathVariable(required = true,name = "longitude") String longitude,
                             @PathVariable(required = true,name = "latitude") String latitude,
                             @PathVariable(required = true,name = "description") String description){
     HashMap retMap = new HashMap();
     try{
         Point point = new Point();
         point.setLongitude(longitude);
         point.setDescription(description);
         point.setLatitude(latitude);
         service.addPoint(point);
         retMap.put("code",1);
         retMap.put("msg","success");
     }catch (Exception e)
     {
         retMap.put("err",e.getMessage());
         retMap.put("code",0);
         retMap.put("msg","fail");
     }
        return retMap;
    }

    /**
     * 删除一个点
     * @param id
     * @return
     */
    @ApiOperation(value = "删除一个节点",notes = "删除一个节点")
    @ApiImplicitParam(name="id",value = "节点id",required = true,dataType = "int")
    @GetMapping("/deletepoint/{id}")
    public HashMap deletepoint(@PathVariable(required = true,name= "id") int id){
        HashMap retMap = new HashMap();
        try{
            service.deletePointById(id);
            retMap.put("code",1);
            retMap.put("msg","success");

        }catch (Exception e){
            retMap.put("err",e.getMessage());
            retMap.put("code",0);
            retMap.put("msg","fail");
        }
        return retMap;
    }

    /**
     * 更新一个节点
     * @param longitude
     * @param latitude
     * @param description
     * @return
     */
    @ApiOperation(value = "更新一个节点",notes = "更新节点信息")
    @ApiImplicitParams({
    @ApiImplicitParam(name="id",value = "节点id",required = true,dataType = "int")
    })
    @GetMapping("/updatepoint/{longitude}/{latitude}/{description}")
    public HashMap updatePoint(@PathVariable(name = "longitude") String longitude,
                               @PathVariable(name = "latitude") String latitude,
                               @PathVariable(name = "description") String description){
        HashMap retMap = new HashMap();
        try{
            Point point = new Point();
            point.setLongitude(longitude);
            point.setDescription(description);
            point.setLatitude(latitude);
            service.updatePoint(point);
            retMap.put("code",1);
            retMap.put("msg","success");

        }catch (Exception e){
            retMap.put("err",e.getMessage());
            retMap.put("code",0);
            retMap.put("msg","fail");
        }
        return retMap;

    }


}
