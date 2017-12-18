package com.yunxi.map.web;

import com.yunxi.map.service.DataInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by MyPC on 2017/12/18.
 */
@RestController
public class DataInfoController {
    @Autowired
    DataInfoService service;
    @ApiOperation(value = "获取全部的线",notes = "获取所有点的数据信息")
    @GetMapping("/getalldateinfo")
    public Object getAllDateInfo(){
      return  service.getAllDateInfo();
    }

}
