package com.yunxi.map.entity;

/**
 * Created by MyPC on 2018/3/5.
 */
public class permissions {
    private long id;
    private String permissionsname;
    private String permissionsenname;
    private String permissionslevel;
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

    public String getPermissionsname() {
        return permissionsname;
    }

    public void setPermissionsname(String permissionsname) {
        this.permissionsname = permissionsname;
    }

    public String getPermissionsenname() {
        return permissionsenname;
    }

    public void setPermissionsenname(String permissionsenname) {
        this.permissionsenname = permissionsenname;
    }

    public String getPermissionslevel() {
        return permissionslevel;
    }

    public void setPermissionslevel(String permissionslevel) {
        this.permissionslevel = permissionslevel;
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

    public permissions() {
    }

    @Override
    public String toString() {
        return "permissions{" +
                "id=" + id +
                ", permissionsname='" + permissionsname + '\'' +
                ", permissionsenname='" + permissionsenname + '\'' +
                ", permissionslevel='" + permissionslevel + '\'' +
                ", extendFieldString='" + extendFieldString + '\'' +
                ", extendFieldLong=" + extendFieldLong +
                ", extendFieldStringB='" + extendFieldStringB + '\'' +
                ", extendFieldLongB=" + extendFieldLongB +
                ", extendFieldStringC='" + extendFieldStringC + '\'' +
                ", extendFieldLongC=" + extendFieldLongC +
                '}';
    }

    public permissions(long id, String permissionsname, String permissionsenname, String permissionslevel, String extendFieldString, long extendFieldLong, String extendFieldStringB, long extendFieldLongB, String extendFieldStringC, long extendFieldLongC) {
        this.id = id;
        this.permissionsname = permissionsname;
        this.permissionsenname = permissionsenname;
        this.permissionslevel = permissionslevel;
        this.extendFieldString = extendFieldString;
        this.extendFieldLong = extendFieldLong;
        this.extendFieldStringB = extendFieldStringB;
        this.extendFieldLongB = extendFieldLongB;
        this.extendFieldStringC = extendFieldStringC;
        this.extendFieldLongC = extendFieldLongC;
    }
}
