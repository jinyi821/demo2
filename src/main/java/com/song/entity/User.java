package com.song.entity;

import javax.persistence.*;

/**
 * Created by Song on 2017/2/15.
 * Model &#x7528;&#x6237;
 */
@Entity
@Table(name = "bs_userinfo")
public class User {

    @Id
    private String loginname;

    private String pwd;

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
