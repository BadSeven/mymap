package com.yunxi.map.entity;

import java.util.Date;

/**
 * Created by MyPC on 2017/12/19.
 */
public class CityDeviceInfo {

    private int id;
    private String cityName;
    private String cityName_ch;
    private String deviceInfo;
    private String IsdeleteDevice;
    private Date creatIndoTime;

    public CityDeviceInfo() {
    }

    public CityDeviceInfo(int id, String cityName, String cityName_ch, String deviceInfo, String isdeleteDevice, Date creatIndoTime) {
        this.id = id;
        this.cityName = cityName;
        this.cityName_ch = cityName_ch;
        this.deviceInfo = deviceInfo;
        IsdeleteDevice = isdeleteDevice;
        this.creatIndoTime = creatIndoTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName_ch() {
        return cityName_ch;
    }

    public void setCityName_ch(String cityName_ch) {
        this.cityName_ch = cityName_ch;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getIsdeleteDevice() {
        return IsdeleteDevice;
    }

    public void setIsdeleteDevice(String isdeleteDevice) {
        IsdeleteDevice = isdeleteDevice;
    }

    public Date getCreatIndoTime() {
        return creatIndoTime;
    }

    public void setCreatIndoTime(Date creatIndoTime) {
        this.creatIndoTime = creatIndoTime;
    }

    @Override
    public String toString() {
        return "CityDeviceInfo{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityName_ch='" + cityName_ch + '\'' +
                ", deviceInfo='" + deviceInfo + '\'' +
                ", IsdeleteDevice='" + IsdeleteDevice + '\'' +
                ", creatIndoTime='" + creatIndoTime + '\'' +
                '}';
    }
}
