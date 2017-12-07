package com.yunxi.map.service;

import com.yunxi.map.dao.UserMapper;
import com.yunxi.map.entity.mUser;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.security.provider.MD5;


/**
 * Created by MyPC on 2017/12/5.
 */
@Service
public class userService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录
     * @param uname
     * @param password
     * @return
     * @throws Exception
     */
    public mUser userLogin(String uname,String password) throws Exception{
        mUser user = new mUser();
        user.setUname(uname);
        user.setPass(password);
        return userMapper.userLogin(user);
    }

    /**
     * 添加用户
     * @param user
     * @return
     * @throws Exception
     */
    @Transactional
    public boolean addUser(mUser user) throws Exception{
       boolean flag=true;
        if(user!=null){
          flag = userMapper.addUser(user);
       }else {
            flag=false;
        }
       return flag;
    }

    public int isExist(String username) throws Exception
    {
        return userMapper.isExist(username);
    }
}
