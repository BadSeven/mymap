package com.yunxi.map.web;

import com.yunxi.map.service.userService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by MyPC on 2017/12/5.
 */
@RestController
public class userController {
   @Autowired
   private userService service;
    @ApiOperation(value = "根据id获取用户信息",notes = "根据id获取用户信息")
    @GetMapping("/user")
    public HashMap userLogin(){
        HashMap map = new HashMap();
        try{
          List list = service.getall();
            map.put("user",list);
            map.put("code",1);
            map.put("msg","login success");
        }catch (Exception e){
            System.out.println(e.getMessage());
            map.put("err",e.getMessage());
            map.put("code",0);
            map.put("msg","login fail");
        }
        return map;
    }
/*
    @ApiOperation(value = "添加用户or用户注册",notes = "添加用户/用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uname", value = "用户名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "pass", value = "用户密码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "role", value = "用具角色（0：超级管理员admin（具备所有权限） 1 普通用户只能有查看的权限2一般管理员 可以增加但是不能删除数据 ）", required = true, dataType = "int"),
            @ApiImplicitParam(name = "phone", value = "电话号码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "email", value = "邮箱地址", required = true, dataType = "String"),
            @ApiImplicitParam(name = "type", value = "添加用户类型（1：用户注册 2：管理员添加）", required = true, dataType = "int"),
    })
    @GetMapping("/adduser/{uname}/{pass}/{role}/{phone}/{email}/{type}")
    public HashMap adduser(@PathVariable(value = "uname" ,required = true) String uname,
                           @PathVariable(value = "pass" ,required = true) String pass,
                           @PathVariable(value = "role" ,required = true) int role,
                           @PathVariable(value = "phone" ,required = true) String phone,
                           @PathVariable(value = "email" ,required = true) String email,
                           @PathVariable(value = "type" ,required = true) int type){
        HashMap map = new HashMap();
        try{
            if(service.isExist(uname.trim())==0) {
                mUser user = new mUser();
                user.setUname(uname);
                user.setPass(pass);
                user.setEmail(email);
                user.setPhone(phone);
                user.setRole(role);
                service.addUser(user);
                map.put("code", 1);
                map.put("msg", "add  success");
            }else {
                map.put("code", 2);
                map.put("msg", "the name is exist  try new name");
            }
        }catch (Exception e){
            map.put("err",e.getMessage());
            map.put("code",0);
            map.put("msg","login fail");
        }
        return map;
    }*/
}
