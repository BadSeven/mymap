package com.yunxi.map.entity;

import java.util.Date;

/**
 * Created by MyPC on 2017/12/19.
 */
public class mapuser {

    private int id;
    private String UserCode;
    private String Username;
    private String Password;
    private String Isdelete;
    private Date CreadtTime;

    public mapuser() {
    }

    public mapuser(int id, String userCode, String username, String password, String isdelete, Date creadtTime) {
        this.id = id;
        UserCode = userCode;
        Username = username;
        Password = password;
        Isdelete = isdelete;
        CreadtTime = creadtTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserCode() {
        return UserCode;
    }

    public void setUserCode(String userCode) {
        UserCode = userCode;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getIsdelete() {
        return Isdelete;
    }

    public void setIsdelete(String isdelete) {
        Isdelete = isdelete;
    }

    public Date getCreadtTime() {
        return CreadtTime;
    }

    public void setCreadtTime(Date creadtTime) {
        CreadtTime = creadtTime;
    }

    @Override
    public String toString() {
        return "mapuser{" +
                "id=" + id +
                ", UserCode='" + UserCode + '\'' +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Isdelete='" + Isdelete + '\'' +
                ", CreadtTime=" + CreadtTime +
                '}';
    }
}
