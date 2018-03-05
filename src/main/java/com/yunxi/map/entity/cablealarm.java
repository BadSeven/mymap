package com.yunxi.map.entity;

import java.util.Date;

/**
 * Created by MyPC on 2018/3/5.
 */
public class cablealarm {
    private long id;
    private String nodename;
    private String nodeip;
    private String nodetype;
    private String cableid;
    private String cablename;
    private String Alarmtype;
    private String alarmreason;
    private String alarmlever;
    private String alarmcontent;
    private Date alarmtime;
    private String extendFieldString;
    private long extendFieldLong;
    private String extendFieldStringB;
    private long extendFieldLongB;
    private String extendFieldStringC;
    private long extendFieldLongC;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public String getNodeip() {
        return nodeip;
    }

    public void setNodeip(String nodeip) {
        this.nodeip = nodeip;
    }

    public String getNodetype() {
        return nodetype;
    }

    public void setNodetype(String nodetype) {
        this.nodetype = nodetype;
    }

    public String getCableid() {
        return cableid;
    }

    public void setCableid(String cableid) {
        this.cableid = cableid;
    }

    public String getCablename() {
        return cablename;
    }

    public void setCablename(String cablename) {
        this.cablename = cablename;
    }

    public String getAlarmtype() {
        return Alarmtype;
    }

    public void setAlarmtype(String alarmtype) {
        Alarmtype = alarmtype;
    }

    public String getAlarmreason() {
        return alarmreason;
    }

    public void setAlarmreason(String alarmreason) {
        this.alarmreason = alarmreason;
    }

    public String getAlarmlever() {
        return alarmlever;
    }

    public void setAlarmlever(String alarmlever) {
        this.alarmlever = alarmlever;
    }

    public String getAlarmcontent() {
        return alarmcontent;
    }

    public void setAlarmcontent(String alarmcontent) {
        this.alarmcontent = alarmcontent;
    }

    public Date getAlarmtime() {
        return alarmtime;
    }

    public void setAlarmtime(Date alarmtime) {
        this.alarmtime = alarmtime;
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

    public cablealarm() {
    }

    @Override
    public String toString() {
        return "cablealarm{" +
                "id=" + id +
                ", nodename='" + nodename + '\'' +
                ", nodeip='" + nodeip + '\'' +
                ", nodetype='" + nodetype + '\'' +
                ", cableid='" + cableid + '\'' +
                ", cablename='" + cablename + '\'' +
                ", Alarmtype='" + Alarmtype + '\'' +
                ", alarmreason='" + alarmreason + '\'' +
                ", alarmlever='" + alarmlever + '\'' +
                ", alarmcontent='" + alarmcontent + '\'' +
                ", alarmtime=" + alarmtime +
                ", extendFieldString='" + extendFieldString + '\'' +
                ", extendFieldLong=" + extendFieldLong +
                ", extendFieldStringB='" + extendFieldStringB + '\'' +
                ", extendFieldLongB=" + extendFieldLongB +
                ", extendFieldStringC='" + extendFieldStringC + '\'' +
                ", extendFieldLongC=" + extendFieldLongC +
                '}';
    }

    public cablealarm(long id, String nodename, String nodeip, String nodetype, String cableid, String cablename, String alarmtype, String alarmreason, String alarmlever, String alarmcontent, Date alarmtime, String extendFieldString, long extendFieldLong, String extendFieldStringB, long extendFieldLongB, String extendFieldStringC, long extendFieldLongC) {
        this.id = id;
        this.nodename = nodename;
        this.nodeip = nodeip;
        this.nodetype = nodetype;
        this.cableid = cableid;
        this.cablename = cablename;
        Alarmtype = alarmtype;
        this.alarmreason = alarmreason;
        this.alarmlever = alarmlever;
        this.alarmcontent = alarmcontent;
        this.alarmtime = alarmtime;
        this.extendFieldString = extendFieldString;
        this.extendFieldLong = extendFieldLong;
        this.extendFieldStringB = extendFieldStringB;
        this.extendFieldLongB = extendFieldLongB;
        this.extendFieldStringC = extendFieldStringC;
        this.extendFieldLongC = extendFieldLongC;
    }
}
