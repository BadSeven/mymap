package com.yunxi.map.entity;

/**
 * Created by MyPC on 2018/3/5.
 */
public class cable {
    private long id;
    private String cableName;
    private long groupid;
    private int cableNumber;
    private String reservedCode;
    private String cableCode;
    private String manufacturer;
    private float distance;
    private int coreNumber;
    private String cableDesc;
    private long startPoint;
    private long endPoint;
    private String item;
    private String cableParam;
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

    public String getCableName() {
        return cableName;
    }

    public void setCableName(String cableName) {
        this.cableName = cableName;
    }

    public long getGroupid() {
        return groupid;
    }

    public void setGroupid(long groupid) {
        this.groupid = groupid;
    }

    public int getCableNumber() {
        return cableNumber;
    }

    public void setCableNumber(int cableNumber) {
        this.cableNumber = cableNumber;
    }

    public String getReservedCode() {
        return reservedCode;
    }

    public void setReservedCode(String reservedCode) {
        this.reservedCode = reservedCode;
    }

    public String getCableCode() {
        return cableCode;
    }

    public void setCableCode(String cableCode) {
        this.cableCode = cableCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getCoreNumber() {
        return coreNumber;
    }

    public void setCoreNumber(int coreNumber) {
        this.coreNumber = coreNumber;
    }

    public String getCableDesc() {
        return cableDesc;
    }

    public void setCableDesc(String cableDesc) {
        this.cableDesc = cableDesc;
    }

    public long getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(long startPoint) {
        this.startPoint = startPoint;
    }

    public long getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(long endPoint) {
        this.endPoint = endPoint;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCableParam() {
        return cableParam;
    }

    public void setCableParam(String cableParam) {
        this.cableParam = cableParam;
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

    public cable() {

    }

    public cable(long id, String cableName, long groupid, int cableNumber, String reservedCode, String cableCode, String manufacturer, float distance, int coreNumber, String cableDesc, long startPoint, long endPoint, String item, String cableParam, String extendFieldString, long extendFieldLong, String extendFieldStringB, long extendFieldLongB, String extendFieldStringC, long extendFieldLongC) {
        this.id = id;
        this.cableName = cableName;
        this.groupid = groupid;
        this.cableNumber = cableNumber;
        this.reservedCode = reservedCode;
        this.cableCode = cableCode;
        this.manufacturer = manufacturer;
        this.distance = distance;
        this.coreNumber = coreNumber;
        this.cableDesc = cableDesc;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.item = item;
        this.cableParam = cableParam;
        this.extendFieldString = extendFieldString;
        this.extendFieldLong = extendFieldLong;
        this.extendFieldStringB = extendFieldStringB;
        this.extendFieldLongB = extendFieldLongB;
        this.extendFieldStringC = extendFieldStringC;
        this.extendFieldLongC = extendFieldLongC;
    }

    @Override
    public String toString() {
        return "cable{" +
                "id=" + id +
                ", cableName='" + cableName + '\'' +
                ", groupid=" + groupid +
                ", cableNumber=" + cableNumber +
                ", reservedCode='" + reservedCode + '\'' +
                ", cableCode='" + cableCode + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", distance=" + distance +
                ", coreNumber=" + coreNumber +
                ", cableDesc='" + cableDesc + '\'' +
                ", startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                ", item='" + item + '\'' +
                ", cableParam='" + cableParam + '\'' +
                ", extendFieldString='" + extendFieldString + '\'' +
                ", extendFieldLong=" + extendFieldLong +
                ", extendFieldStringB='" + extendFieldStringB + '\'' +
                ", extendFieldLongB=" + extendFieldLongB +
                ", extendFieldStringC='" + extendFieldStringC + '\'' +
                ", extendFieldLongC=" + extendFieldLongC +
                '}';
    }
}
