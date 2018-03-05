package com.yunxi.map.entity;

import java.util.Date;

/**
 * Created by MyPC on 2018/3/5.
 */
public class cablegroup {
    private long id;
    private String groupName;
    private String groupDesc;
    private String parentGroup;
    private String district;
    private String principal;
    private Date entryTime;
    private String entryUser;
    private Date updateTime;
    private String UpdateUser;
    private String groupImageFile;
    private String groupBackgroundImagefile;
    private String netMask;
    private String groupParam;
    private String extendFieldString;
    private long extendFieldLong;
    private String extendFieldStringB;
    private long extendFieldLongB;
    private String extendFieldStringC;
    private long extendFieldLongC;

    public cablegroup() {
    }

    @Override
    public String toString() {
        return "cablegroup{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", groupDesc='" + groupDesc + '\'' +
                ", parentGroup='" + parentGroup + '\'' +
                ", district='" + district + '\'' +
                ", principal='" + principal + '\'' +
                ", entryTime=" + entryTime +
                ", entryUser='" + entryUser + '\'' +
                ", updateTime=" + updateTime +
                ", UpdateUser='" + UpdateUser + '\'' +
                ", groupImageFile='" + groupImageFile + '\'' +
                ", groupBackgroundImagefile='" + groupBackgroundImagefile + '\'' +
                ", netMask='" + netMask + '\'' +
                ", groupParam='" + groupParam + '\'' +
                ", extendFieldString='" + extendFieldString + '\'' +
                ", extendFieldLong=" + extendFieldLong +
                ", extendFieldStringB='" + extendFieldStringB + '\'' +
                ", extendFieldLongB=" + extendFieldLongB +
                ", extendFieldStringC='" + extendFieldStringC + '\'' +
                ", extendFieldLongC=" + extendFieldLongC +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getParentGroup() {
        return parentGroup;
    }

    public void setParentGroup(String parentGroup) {
        this.parentGroup = parentGroup;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntryUser() {
        return entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return UpdateUser;
    }

    public void setUpdateUser(String updateUser) {
        UpdateUser = updateUser;
    }

    public String getGroupImageFile() {
        return groupImageFile;
    }

    public void setGroupImageFile(String groupImageFile) {
        this.groupImageFile = groupImageFile;
    }

    public String getGroupBackgroundImagefile() {
        return groupBackgroundImagefile;
    }

    public void setGroupBackgroundImagefile(String groupBackgroundImagefile) {
        this.groupBackgroundImagefile = groupBackgroundImagefile;
    }

    public String getNetMask() {
        return netMask;
    }

    public void setNetMask(String netMask) {
        this.netMask = netMask;
    }

    public String getGroupParam() {
        return groupParam;
    }

    public void setGroupParam(String groupParam) {
        this.groupParam = groupParam;
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

    public cablegroup(long id, String groupName, String groupDesc, String parentGroup, String district, String principal, Date entryTime, String entryUser, Date updateTime, String updateUser, String groupImageFile, String groupBackgroundImagefile, String netMask, String groupParam, String extendFieldString, long extendFieldLong, String extendFieldStringB, long extendFieldLongB, String extendFieldStringC, long extendFieldLongC) {
        this.id = id;
        this.groupName = groupName;
        this.groupDesc = groupDesc;
        this.parentGroup = parentGroup;
        this.district = district;
        this.principal = principal;
        this.entryTime = entryTime;
        this.entryUser = entryUser;
        this.updateTime = updateTime;
        UpdateUser = updateUser;
        this.groupImageFile = groupImageFile;
        this.groupBackgroundImagefile = groupBackgroundImagefile;
        this.netMask = netMask;
        this.groupParam = groupParam;
        this.extendFieldString = extendFieldString;
        this.extendFieldLong = extendFieldLong;
        this.extendFieldStringB = extendFieldStringB;
        this.extendFieldLongB = extendFieldLongB;
        this.extendFieldStringC = extendFieldStringC;
        this.extendFieldLongC = extendFieldLongC;
    }
}
