package com.yunxi.map.entity;

import java.util.Date;

/**
 * Created by MyPC on 2018/3/5.
 */
public class userlog {
    private long id;
    private long userid;
    private String username;
    private Date operateTime;
    private String operateObject;
    private String operateAction;
    private String logDesc;
    private String extendFieldString;
    private long extendFieldLong;
    private String extendFieldStringB;
    private long extendFieldLongB;
    private String extendFieldStringC;
    private long extendFieldLongC;

    public userlog() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateObject() {
        return operateObject;
    }

    public void setOperateObject(String operateObject) {
        this.operateObject = operateObject;
    }

    public String getOperateAction() {
        return operateAction;
    }

    public void setOperateAction(String operateAction) {
        this.operateAction = operateAction;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
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
        return "userlogMapper.xml{" +
                "id=" + id +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", operateTime=" + operateTime +
                ", operateObject='" + operateObject + '\'' +
                ", operateAction='" + operateAction + '\'' +
                ", logDesc='" + logDesc + '\'' +
                ", extendFieldString='" + extendFieldString + '\'' +
                ", extendFieldLong=" + extendFieldLong +
                ", extendFieldStringB='" + extendFieldStringB + '\'' +
                ", extendFieldLongB=" + extendFieldLongB +
                ", extendFieldStringC='" + extendFieldStringC + '\'' +
                ", extendFieldLongC=" + extendFieldLongC +
                '}';
    }
}
