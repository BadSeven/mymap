package com.yunxi.map.web;

import com.yunxi.map.entity.mapuser;
import com.yunxi.map.service.mapUserService;
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
@RequestMapping("/mapuser")
public class mapuserController {

    @Autowired
    private mapUserService service;


    /**
     *
     * @param name
     * @param password
     * @return
     */

    @ApiOperation(value = "登录",notes = "用户名密码登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value = "名称",required = true,dataType = "String"),
            @ApiImplicitParam(name="password",value = "密码",required = true,dataType = "String")
    })
    @PostMapping("/login/{name}/{password}")
    public mapuser login(@PathVariable(name="name")String name,
                         @PathVariable(name = "password") String password){
        mapuser user = new mapuser();
        user.setUsername(name);
        user.setPassword(password);
       return service.login(user);
    }

    /**
     *
     *
     * @param id
     * @return
     */

    @ApiOperation(value = "查询",notes = "获取用户信息")
    @ApiImplicitParam(name="id",value = "id",required = true,dataType = "int")
    @GetMapping("/getuserbyid/{id}")
    public mapuser getUserByid(@PathVariable(name = "id") int id){
        mapuser user = new mapuser();
        user.setId(id);
        return service.getUserByid(id);
    }


    /**
     *
     * @param UserCode
     * @param Username
     * @param Password
     * @param Isdelete
     * @return
     */
    @ApiOperation(value = "添加",notes = "用户或者注册用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name="UserCode",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Username",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Password",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Isdelete",value = "详情见文档",required = true,dataType = "String"),
    })
    @GetMapping("/adduer/{UserCode}/{Username}/{Password}/{Isdelete}")
    public HashMap registeredoradduser(@PathVariable(name="UserCode") String UserCode,
                                       @PathVariable(name="Username") String Username,
                                       @PathVariable(name="Password") String Password,
                                       @PathVariable(name="Isdelete") String Isdelete
                                       ) {
        HashMap map = new HashMap();
        mapuser user = new mapuser(0,UserCode, Username, Password, Isdelete,null);
        try{
            service.registeredoradduser(user);
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
     * @return
     */
    @ApiOperation(value = "删除",notes = "删除用户用户")
    @GetMapping("/deluser/{id}")
    public  HashMap deluser(@PathVariable(name="id") int id){
        HashMap map = new HashMap();
        try{
            service.deluser(id);
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
     * @param UserCode
     * @param Username
     * @param Password
     * @param Isdelete
     * @param CreadtTime
     * @return
     */
    @ApiOperation(value = "修改",notes = "修改用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value = "详情见文档",required = true,dataType = "int"),
            @ApiImplicitParam(name="UserCode",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Username",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Password",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="Isdelete",value = "详情见文档",required = true,dataType = "String"),
            @ApiImplicitParam(name="CreadtTime",value = "详情见文档",required = true,dataType = "Date"),
    })
    @GetMapping("/updateuser/{id}/{UserCode}/{Username}/{Password}/{Isdelete}/{CreadtTime}")
    public  HashMap updateuser(@PathVariable(name="id") int id,
                               @PathVariable(name="UserCode") String UserCode,
                               @PathVariable(name="Username") String Username,
                               @PathVariable(name="Password") String Password,
                               @PathVariable(name="Isdelete") String Isdelete,
                               @PathVariable(name="CreadtTime") Date CreadtTime){
        HashMap map = new HashMap();
        mapuser user = new mapuser(id,UserCode, Username, Password, Isdelete,CreadtTime);
        try{
            service.updateuser(user);
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
