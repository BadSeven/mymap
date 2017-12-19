package com.yunxi.map.web;

import com.yunxi.map.entity.CityDeviceInfo;
import com.yunxi.map.service.CityDeviceInfoService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by MyPC on 2017/12/19.
 */
@RestController
@RequestMapping("/cityinfo")
public class CityDeviceInfoController {

    @Autowired
    private CityDeviceInfoService service;


    @ApiOperation(value = "查询操作",notes = "获取数据信息")
    @GetMapping("/getall")
    public Object getall(){
        return service.getall();
    }


    @ApiOperation(value = "删除操作",notes = "删除一个info")
    @ApiImplicitParam(name="id",value = "citydeviceinfo表的id",required = true,dataType = "int")
    @GetMapping("/delinfo/{id}")
    public HashMap delinfo(@PathVariable(name="id") int id){
        HashMap map = new HashMap();
        try{
            service.delinfo(id);
            map.put("code","1");
            map.put("msg","成功");
        }catch (Exception e){
            map.put("err",e.getMessage());
            map.put("code","-1");
            map.put("msg","fail");
        }
    return map;
    }

    /***
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "查询操作",notes = "查询一个info")
    @ApiImplicitParam(name="id",value = "citydeviceinfo表的id",required = true,dataType = "int")
    @GetMapping("/getdeviceinfobyid/{id}")
    public  Object getdeviceinfobyid(@PathVariable(name="id") int id){
        return service.getdeviceinfobyid(id);
    }

    /**
     *
     * @param cityName
     * @param cityName_ch
     * @param deviceInfo
     * @param IsdeleteDevice
     * @return
     */

    @ApiOperation(value = "添加操作",notes = "添加一个info")
    @ApiImplicitParams({
            @ApiImplicitParam(name="cityName",value = "citydeviceinfo表的id",required = true,dataType = "String"),
            @ApiImplicitParam(name="cityName_ch",value = "citydeviceinfo表的id",required = true,dataType = "String"),
            @ApiImplicitParam(name="deviceInfo",value = "citydeviceinfo表的id",required = true,dataType = "String"),
            @ApiImplicitParam(name="IsdeleteDevice",value = "citydeviceinfo表的id",required = true,dataType = "String")})
    @GetMapping("/addinfo/{cityName}/{cityName_ch}/{deviceInfo}/{IsdeleteDevice}")
    public HashMap addinfo(@PathVariable(name="cityName") String cityName,
                           @PathVariable(name="cityName_ch") String cityName_ch,
                           @PathVariable(name="deviceInfo") String deviceInfo,
                           @PathVariable(name="IsdeleteDevice") String IsdeleteDevice){
        CityDeviceInfo c = new CityDeviceInfo(0,cityName,cityName_ch,deviceInfo,IsdeleteDevice,null);
        HashMap map = new HashMap();
        try{
            service.addinfo(c);
            map.put("code","1");
            map.put("msg","成功");
        }catch (Exception e){
            map.put("err",e.getMessage());
            map.put("code","-1");
            map.put("msg","fail");
        }
    return  map;
    }

    /**
     *
     * @param id
     * @param cityName
     * @param cityName_ch
     * @param deviceInfo
     * @param IsdeleteDevice
     * @param creatIndoTime
     * @return
     */
    @ApiOperation(value = "更新操作",notes = "更新一个info")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value = "citydeviceinfo表的id",required = true,dataType = "int"),
            @ApiImplicitParam(name="cityName",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="cityName_ch",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="deviceInfo",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="IsdeleteDevice",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="creatIndoTime",value = "详情见文档",required = true,dataType = "Date")})
    @GetMapping("/updateifno/{id}/{cityName}/{cityName_ch}/{deviceInfo}/{IsdeleteDevice}/{creatIndoTime}")
    public HashMap updateinfo(@PathVariable(name="id") int id,
                              @PathVariable(name="cityName") String cityName,
                              @PathVariable(name="cityName_ch") String cityName_ch,
                              @PathVariable(name="deviceInfo") String deviceInfo,
                              @PathVariable(name="IsdeleteDevice") String IsdeleteDevice,
                              @PathVariable(name="creatIndoTime") Date creatIndoTime){

        HashMap map = new HashMap();
        CityDeviceInfo c = new CityDeviceInfo(id,cityName,cityName_ch,deviceInfo,IsdeleteDevice,creatIndoTime);
        try{
            service.upateinfo(c);
            map.put("code","1");
            map.put("msg","成功");
        }catch (Exception e){
            map.put("err",e.getMessage());
            map.put("code","-1");
            map.put("msg","fail");
        }
        return  map;
    }




}
