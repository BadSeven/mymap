package com.yunxi.map.entity;

/**
 * Created by MyPC on 2018/3/5.
 */
public class cablepoint {

    private long id;
    private String pointName;
    private String pointDesc;
    private double longitude;
    private double latitude;
    private long beforepointid;
    private long nextpointid;
    private float  distance;
    private String imageFile;
    private long cableid;
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

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getPointDesc() {
        return pointDesc;
    }

    public void setPointDesc(String pointDesc) {
        this.pointDesc = pointDesc;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public long getBeforepointid() {
        return beforepointid;
    }

    public void setBeforepointid(long beforepointid) {
        this.beforepointid = beforepointid;
    }

    public long getNextpointid() {
        return nextpointid;
    }

    public void setNextpointid(long nextpointid) {
        this.nextpointid = nextpointid;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public long getCableid() {
        return cableid;
    }

    public void setCableid(long cableid) {
        this.cableid = cableid;
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

    public cablepoint() {
    }

    public cablepoint(long id, String pointName, String pointDesc, double longitude, double latitude, long beforepointid, long nextpointid, float distance, String imageFile, long cableid, String extendFieldString, long extendFieldLong, String extendFieldStringB, long extendFieldLongB, String extendFieldStringC, long extendFieldLongC) {
        this.id = id;
        this.pointName = pointName;
        this.pointDesc = pointDesc;
        this.longitude = longitude;
        this.latitude = latitude;
        this.beforepointid = beforepointid;
        this.nextpointid = nextpointid;
        this.distance = distance;
        this.imageFile = imageFile;
        this.cableid = cableid;
        this.extendFieldString = extendFieldString;
        this.extendFieldLong = extendFieldLong;
        this.extendFieldStringB = extendFieldStringB;
        this.extendFieldLongB = extendFieldLongB;
        this.extendFieldStringC = extendFieldStringC;
        this.extendFieldLongC = extendFieldLongC;
    }

    @Override
    public String toString() {
        return "cablepoint{" +
                "id=" + id +
                ", pointName='" + pointName + '\'' +
                ", pointDesc='" + pointDesc + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", beforepointid=" + beforepointid +
                ", nextpointid=" + nextpointid +
                ", distance=" + distance +
                ", imageFile='" + imageFile + '\'' +
                ", cableid=" + cableid +
                ", extendFieldString='" + extendFieldString + '\'' +
                ", extendFieldLong=" + extendFieldLong +
                ", extendFieldStringB='" + extendFieldStringB + '\'' +
                ", extendFieldLongB=" + extendFieldLongB +
                ", extendFieldStringC='" + extendFieldStringC + '\'' +
                ", extendFieldLongC=" + extendFieldLongC +
                '}';
    }
}
