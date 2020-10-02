package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable{

    @Id
    String userid;
    String password;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String userid, String password) {
        super();
        this.userid = userid;
        this.password = password;
    }

    public String getuserid() {
        return userid;
    }

    public void setuserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [userid=" + userid + ", password=" + password + "]";
    }
}
