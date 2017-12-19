package com.yunxi.map.web;

import com.yunxi.map.entity.DataInfo;
import com.yunxi.map.service.DataInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.HashMap;


/**
 * Created by MyPC on 2017/12/18.
 */
@RestController
@RequestMapping("/data")
public class DataInfoController {
    @Autowired
    DataInfoService service;

    /**
     * 获取全部数据信息
     * @return
     */
    @ApiOperation(value = "查询操作",notes = "获取数据信息")
    @GetMapping("/getallinfo")
    public Object getAllDateInfo(){
      return  service.getAllDateInfo();
    }

    @ApiOperation(value = "删除操作",notes = "删除一个info")
    @ApiImplicitParam(name="infoid",value = "info表的id",required = true,dataType = "int")
    @PostMapping("/delinfo/{infoid}")
    public HashMap delifno(@PathVariable(name="infoid") int infoid){
        HashMap map = new HashMap();
        try{
            service.delInfo(infoid);
            map.put("code","1");
            map.put("msg","success");
        }catch (Exception e){
            map.put("err",e.getMessage());
            map.put("code","-1");
            map.put("msg","fail");
        }
        return map;
    }

    /**
     * 更新info
     * @param infoid
     * @param userCode
     * @param startCityName
     * @param PassCityName
     * @param StartName_ch
     * @param PassCityName_ch
     * @param StartX_axis
     * @param StartY_axis
     * @param PassX_axis
     * @param PassY_axis
     * @param DeviceName
     * @param Start_deviceInfo
     * @param Pass_deviveInfo
     * @param creatIndoTime
     * @param isdelete
     * @return
     */
    @ApiOperation(value = "更新操作",notes = "更新一个info")
    @ApiImplicitParams({
            @ApiImplicitParam(name="infoid",value = "info表的id",required = true,dataType = "int"),
            @ApiImplicitParam(name="userCode",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="startCityName",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="PassCityName",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="StartName_ch",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="PassCityName_ch",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="StartX_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="StartY_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="PassX_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="PassY_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="DeviceName",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Start_deviceInfo",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="creatIndoTime",value = "查看文档",required = true,dataType = "Date"),
            @ApiImplicitParam(name="isdelete",value = "查看文档",required = true,dataType = "String"),
    })
    @RequestMapping("/updateinfo/{infoid}/{userCode}/{startCityName}/{PassCityName}/" +
            "{StartName_ch}/{PassCityName_ch}/{StartX_axis}/{StartY_axis}/{PassX_axis}/{PassY_axis}/{DeviceName}/" +
            "{Start_deviceInfo}/{Pass_deviveInfo}/{creatIndoTime}/{isdelete}")
    public HashMap updateinfo(@PathVariable(name="infoid")int infoid,
                              @PathVariable(name="userCode")String userCode,
                              @PathVariable(name="startCityName")String startCityName,
                              @PathVariable(name="PassCityName")String PassCityName,
                              @PathVariable(name="StartName_ch")String StartName_ch,
                              @PathVariable(name="PassCityName_ch")String PassCityName_ch,
                              @PathVariable(name="StartX_axis")int StartX_axis,
                              @PathVariable(name="StartY_axis")int StartY_axis,
                              @PathVariable(name="PassX_axis")int PassX_axis,
                              @PathVariable(name="PassY_axis")int PassY_axis,
                              @PathVariable(name="DeviceName")String DeviceName,
                              @PathVariable(name="Start_deviceInfo")String Start_deviceInfo,
                              @PathVariable(name="Pass_deviveInfo")String Pass_deviveInfo,
                              @PathVariable(name="creatIndoTime")Data creatIndoTime,
                              @PathVariable(name="isdelete")String isdelete
                              ){

        HashMap map = new HashMap();
        DataInfo  d = new DataInfo(infoid, userCode, startCityName, PassCityName, StartName_ch, PassCityName_ch, StartX_axis, StartY_axis, PassX_axis, PassY_axis, DeviceName, Start_deviceInfo, Pass_deviveInfo, creatIndoTime, isdelete);
        try {
            service.updateinfo(d);
            map.put("code","1");
            map.put("msg","success");

        }catch (Exception e){
            map.put("err",e.getMessage());
            map.put("code","-1");
            map.put("msg","fail");
        }
        return map;
    }

    /**
     *
     * @param userCode
     * @param startCityName
     * @param PassCityName
     * @param StartName_ch
     * @param PassCityName_ch
     * @param StartX_axis
     * @param StartY_axis
     * @param PassX_axis
     * @param PassY_axis
     * @param DeviceName
     * @param Start_deviceInfo
     * @param Pass_deviveInfo
     * @param creatIndoTime
     * @param isdelete
     * @return
     */
    @ApiOperation(value = "添加操作",notes = "添加一个info")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userCode",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="startCityName",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="PassCityName",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="StartName_ch",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="PassCityName_ch",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="StartX_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="StartY_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="PassX_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="PassY_axis",value = "查看文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="DeviceName",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Start_deviceInfo",value = "查看文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="creatIndoTime",value = "查看文档",required = true,dataType = "Date"),
            @ApiImplicitParam(name="isdelete",value = "查看文档",required = true,dataType = "String"),
    })
    @PostMapping("/addinfo/{userCode}/{startCityName}/{PassCityName}/" +
            "{StartName_ch}/{PassCityName_ch}/{StartX_axis}/{StartY_axis}/{PassX_axis}/{PassY_axis}/{DeviceName}/" +
            "{Start_deviceInfo}/{Pass_deviveInfo}/{creatIndoTime}/{isdelete}")
    public HashMap addinfo(
                           @PathVariable(name="userCode")String userCode,
                           @PathVariable(name="startCityName")String startCityName,
                           @PathVariable(name="PassCityName")String PassCityName,
                           @PathVariable(name="StartName_ch")String StartName_ch,
                           @PathVariable(name="PassCityName_ch")String PassCityName_ch,
                           @PathVariable(name="StartX_axis")int StartX_axis,
                           @PathVariable(name="StartY_axis")int StartY_axis,
                           @PathVariable(name="PassX_axis")int PassX_axis,
                           @PathVariable(name="PassY_axis")int PassY_axis,
                           @PathVariable(name="DeviceName")String DeviceName,
                           @PathVariable(name="Start_deviceInfo")String Start_deviceInfo,
                           @PathVariable(name="Pass_deviveInfo")String Pass_deviveInfo,
                           @PathVariable(name="creatIndoTime")Data creatIndoTime,
                           @PathVariable(name="isdelete")String isdelete
    ){
    HashMap map = new HashMap();
    DataInfo  d = new DataInfo(0, userCode, startCityName, PassCityName, StartName_ch, PassCityName_ch, StartX_axis, StartY_axis, PassX_axis, PassY_axis, DeviceName, Start_deviceInfo, Pass_deviveInfo, creatIndoTime, isdelete);
        try {
        service.addinfo(d);
        map.put("code","1");
        map.put("msg","success");

    }catch (Exception e){
        map.put("err",e.getMessage());
        map.put("code","-1");
        map.put("msg","fail");
    }
        return map;
    }

    /**
     *
     *
     * @param infoid
     * @return
     */
    @ApiOperation(value = "查询操作",notes = "查询一个info")
    @ApiImplicitParam(name ="infoid",value = "inf表的id",required = true,dataType = "int" )
    @GetMapping("/getinfobyid/{infoid}")
    public DataInfo getinfobyid(@PathVariable(name = "infoid") int infoid){
        return service.getinfobyid(infoid);

    }

}
