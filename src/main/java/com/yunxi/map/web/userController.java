package com.yunxi.map.web;

import com.yunxi.map.entity.mapUser;
import com.yunxi.map.service.userService;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MyPC on 2017/12/5.
 */
@RestController
@MapperScan("com.yunxi.map.dao")
public class userController {

    @Autowired
    private userService service;


    @ApiOperation(value = "通过用户id登录",notes = "通过用户id登录")
    @RequestMapping(value = "/getUserById/{id}" ,method = RequestMethod.GET)
    public mapUser getUserById(@PathVariable(name="id") int id){
        return service.getUserById(id);
    }


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi()
    {
        return "hello";
    }


}
