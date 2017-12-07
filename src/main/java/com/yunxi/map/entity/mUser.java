package com.yunxi.map.entity;

import java.util.Date;

public class mUser {
    private Integer id;

    private String uname;

    @Override
    public String toString() {
        return "mUser{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pass='" + pass + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", addtime=" + addtime +
                '}';
    }

    private String pass;

    private String phone;

    private String email;

    private int role;

    private Date addtime;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }



    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }


}