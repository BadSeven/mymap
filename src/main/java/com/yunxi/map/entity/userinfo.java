package com.yunxi.map.entity;

import java.util.Date;

/**
 * Created by MyPC on 2018/3/5.
 * user用户信息
 */
public class userinfo {


    private long id;
    private String username;
    private String userchinaname;
    private Date createtime;
    private Date updatedtime;
    private int  isenablerecievermessage;
    private String  email;
    private String telephonenum;
    private String userDesc;
    private String extendFieldString;
    private long extendFieldLong;
    private String extendFieldStringB;
    private long extendFieldLongB;
    private String extendFieldStringC;
    private long extendFieldLongC;

    public userinfo(long id, String username, String userchinaname, Date createtime, Date updatedtime, int isenablerecievermessage, String email, String telephonenum, String userDesc, String extendFieldString, long extendFieldLong, String extendFieldStringB, long extendFieldLongB, String extendFieldStringC, long extendFieldLongC) {
        this.id = id;
        this.username = username;
        this.userchinaname = userchinaname;
        this.createtime = createtime;
        this.updatedtime = updatedtime;
        this.isenablerecievermessage = isenablerecievermessage;
        this.email = email;
        this.telephonenum = telephonenum;
        this.userDesc = userDesc;
        this.extendFieldString = extendFieldString;
        this.extendFieldLong = extendFieldLong;
        this.extendFieldStringB = extendFieldStringB;
        this.extendFieldLongB = extendFieldLongB;
        this.extendFieldStringC = extendFieldStringC;
        this.extendFieldLongC = extendFieldLongC;
    }




    public userinfo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserchinaname() {
        return userchinaname;
    }

    public void setUserchinaname(String userchinaname) {
        this.userchinaname = userchinaname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Date updatedtime) {
        this.updatedtime = updatedtime;
    }

    public int getIsenablerecievermessage() {
        return isenablerecievermessage;
    }

    public void setIsenablerecievermessage(int isenablerecievermessage) {
        this.isenablerecievermessage = isenablerecievermessage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephonenum() {
        return telephonenum;
    }

    public void setTelephonenum(String telephonenum) {
        this.telephonenum = telephonenum;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getExtendFieldString() {
        return extendFieldString;
    }

    public void setExtendFieldString(String extendFieldString) {
        this.extendFieldString = extendFieldString;
    }

    public long getExtendFieldLong() {
        return extendFieldLong;
    }

    public void setExtendFieldLong(long extendFieldLong) {
        this.extendFieldLong = extendFieldLong;
    }

    public String getExtendFieldStringB() {
        return extendFieldStringB;
    }

    public void setExtendFieldStringB(String extendFieldStringB) {
        this.extendFieldStringB = extendFieldStringB;
    }

    public long getExtendFieldLongB() {
        return extendFieldLongB;
    }

    public void setExtendFieldLongB(long extendFieldLongB) {
        this.extendFieldLongB = extendFieldLongB;
    }

    public String getExtendFieldStringC() {
        return extendFieldStringC;
    }

    public void setExtendFieldStringC(String extendFieldStringC) {
        this.extendFieldStringC = extendFieldStringC;
    }

    public long getExtendFieldLongC() {
        return extendFieldLongC;
    }

    public void setExtendFieldLongC(long extendFieldLongC) {
        this.extendFieldLongC = extendFieldLongC;
    }

    @Override
    public String toString() {
        return "userinfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userchinaname='" + userchinaname + '\'' +
                ", createtime=" + createtime +
                ", updatedtime=" + updatedtime +
                ", isenablerecievermessage=" + isenablerecievermessage +
                ", email='" + email + '\'' +
                ", telephonenum='" + telephonenum + '\'' +
                ", userDesc='" + userDesc + '\'' +
                ", extendFieldString='" + extendFieldString + '\'' +
                ", extendFieldLong=" + extendFieldLong +
                ", extendFieldStringB='" + extendFieldStringB + '\'' +
                ", extendFieldLongB=" + extendFieldLongB +
                ", extendFieldStringC='" + extendFieldStringC + '\'' +
                ", extendFieldLongC=" + extendFieldLongC +
                '}';
    }

}
