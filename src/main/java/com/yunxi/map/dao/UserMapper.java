package com.yunxi.map.dao;

import com.yunxi.map.entity.mUser;


import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 用户登录
     * @param user
     * @return
     * @throws Exception
     */
    public  mUser userLogin(mUser user) throws Exception;

    /**
     * 添加一个用户
     * @param user
     * @return
     * @throws Exception
     */
    public boolean addUser(mUser user) throws Exception;

    /***
     * 修改用户信息
     * @param user
     * @return
     * @throws Exception
     */
    public boolean update(mUser user) throws Exception;

    /**
     * 判断是否存在用户
     * @param username
     * @return
     * @throws Exception
     */
    public int isExist(@Param("username") String username) throws Exception;
}