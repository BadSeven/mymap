package com.yunxi.map.entity;

import java.util.Date;

public class Line {
    private Integer id;

    private Integer sid;

    private Integer eid;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer direction;

    private String description;

    private String  distance;

    private Date addtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Line{" +
                "id=" + id +
                ", sid=" + sid +
                ", eid=" + eid +
                ", name='" + name + '\'' +
                ", direction=" + direction +
                ", description='" + description + '\'' +
                ", distance='" + distance + '\'' +
                ", addtime=" + addtime +
                '}';
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}