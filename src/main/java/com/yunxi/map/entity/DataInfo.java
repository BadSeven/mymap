package com.yunxi.map.entity;

import javax.xml.crypto.Data;

/**
 * Created by MyPC on 2017/12/18.
 */
public class DataInfo {




    private int infoid;
    private String UserCode;
    private String PassCityName;
    private String StartName_ch;
    private String PassCityName_ch;
    private int StartX_axis;
    private int StartY_axis;
    private int PassX_axis;
    private int PassY_axis   ;
    private String DeviceName;
    private String Start_deviceInfo;
    private String Pass_deviveInfo;
    private Data creatIndoTime;
    private String isdelete;
    @Override
    public String toString() {
        return "DataInfo{" +
                "infoid=" + infoid +
                ", UserCode='" + UserCode + '\'' +
                ", PassCityName='" + PassCityName + '\'' +
                ", StartName_ch='" + StartName_ch + '\'' +
                ", PassCityName_ch='" + PassCityName_ch + '\'' +
                ", StartX_axis=" + StartX_axis +
                ", StartY_axis=" + StartY_axis +
                ", PassX_axis=" + PassX_axis +
                ", PassY_axis=" + PassY_axis +
                ", DeviceName='" + DeviceName + '\'' +
                ", Start_deviceInfo='" + Start_deviceInfo + '\'' +
                ", Pass_deviveInfo='" + Pass_deviveInfo + '\'' +
                ", creatIndoTime='" + creatIndoTime + '\'' +
                ", isdelete='" + isdelete + '\'' +
                '}';
    }



    public DataInfo(int infoid, String userCode, String passCityName, String startName_ch, String passCityName_ch, int startX_axis, int startY_axis, int passX_axis, int passY_axis, String deviceName, String start_deviceInfo, String pass_deviveInfo, Data creatIndoTime, String isdelete) {
        this.infoid = infoid;
        UserCode = userCode;
        PassCityName = passCityName;
        StartName_ch = startName_ch;
        PassCityName_ch = passCityName_ch;
        StartX_axis = startX_axis;
        StartY_axis = startY_axis;
        PassX_axis = passX_axis;
        PassY_axis = passY_axis;
        DeviceName = deviceName;
        Start_deviceInfo = start_deviceInfo;
        Pass_deviveInfo = pass_deviveInfo;
        this.creatIndoTime = creatIndoTime;
        this.isdelete = isdelete;
    }



    public int getInfoid() {
        return infoid;
    }

    public void setInfoid(int infoid) {
        this.infoid = infoid;
    }

    public String getUserCode() {
        return UserCode;
    }

    public void setUserCode(String userCode) {
        UserCode = userCode;
    }

    public String getPassCityName() {
        return PassCityName;
    }

    public void setPassCityName(String passCityName) {
        PassCityName = passCityName;
    }

    public String getStartName_ch() {
        return StartName_ch;
    }

    public void setStartName_ch(String startName_ch) {
        StartName_ch = startName_ch;
    }

    public String getPassCityName_ch() {
        return PassCityName_ch;
    }

    public void setPassCityName_ch(String passCityName_ch) {
        PassCityName_ch = passCityName_ch;
    }

    public int getStartX_axis() {
        return StartX_axis;
    }

    public void setStartX_axis(int startX_axis) {
        StartX_axis = startX_axis;
    }

    public int getStartY_axis() {
        return StartY_axis;
    }

    public void setStartY_axis(int startY_axis) {
        StartY_axis = startY_axis;
    }

    public int getPassX_axis() {
        return PassX_axis;
    }

    public void setPassX_axis(int passX_axis) {
        PassX_axis = passX_axis;
    }

    public int getPassY_axis() {
        return PassY_axis;
    }

    public void setPassY_axis(int passY_axis) {
        PassY_axis = passY_axis;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public String getStart_deviceInfo() {
        return Start_deviceInfo;
    }

    public void setStart_deviceInfo(String start_deviceInfo) {
        Start_deviceInfo = start_deviceInfo;
    }

    public String getPass_deviveInfo() {
        return Pass_deviveInfo;
    }

    public void setPass_deviveInfo(String pass_deviveInfo) {
        Pass_deviveInfo = pass_deviveInfo;
    }

    public Data getCreatIndoTime() {
        return creatIndoTime;
    }

    public void setCreatIndoTime(Data creatIndoTime) {
        this.creatIndoTime = creatIndoTime;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }
}
