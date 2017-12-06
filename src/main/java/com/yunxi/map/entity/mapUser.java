package com.yunxi.map.entity;

/**
 * Created by MyPC on 2017/12/5.
 */
public class mapUser {

    private int id;
    private String uname;
    private String pass;
    private int login;

    @Override
    public String toString() {
        return "mapUser{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pass='" + pass + '\'' +
                ", login=" + login +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }
}
