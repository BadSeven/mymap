package com.yunxi.map.entity;

/**
 * Created by MyPC on 2017/12/5.
 */
public class line {

    private int id;
    private String longitudeA;
    private String latitudeA;
    private String longitudeB;
    private String latitudeB;
    private int direction;

    @Override
    public String toString() {
        return "line{" +
                "id=" + id +
                ", longitudeA='" + longitudeA + '\'' +
                ", latitudeA='" + latitudeA + '\'' +
                ", longitudeB='" + longitudeB + '\'' +
                ", latitudeB='" + latitudeB + '\'' +
                ", direction=" + direction +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLongitudeA() {
        return longitudeA;
    }

    public void setLongitudeA(String longitudeA) {
        this.longitudeA = longitudeA;
    }

    public String getLatitudeA() {
        return latitudeA;
    }

    public void setLatitudeA(String latitudeA) {
        this.latitudeA = latitudeA;
    }

    public String getLongitudeB() {
        return longitudeB;
    }

    public void setLongitudeB(String longitudeB) {
        this.longitudeB = longitudeB;
    }

    public String getLatitudeB() {
        return latitudeB;
    }

    public void setLatitudeB(String latitudeB) {
        this.latitudeB = latitudeB;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
