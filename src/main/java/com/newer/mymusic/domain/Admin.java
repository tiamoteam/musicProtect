package com.newer.mymusic.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    private static final long serialVersionUID = 6731319246247589677L;
    private int id;  //管理员id
    private String aname; //管理员账号
    private String pwd; //管理员密码l
    private String quanxian;//权限等级
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dltime;//成为管理员的日期
    private String enable; //是否启用
    public Admin() {
    }

    public Admin(int id, String aname, String pwd, String quanxian, Date dltime, String enable) {
        this.id = id;
        this.aname = aname;
        this.pwd = pwd;
        this.quanxian = quanxian;
        this.dltime = dltime;
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getQuanxian() {
        return quanxian;
    }

    public void setQuanxian(String quanxian) {
        this.quanxian = quanxian;
    }

    public Date getDltime() {
        return dltime;
    }

    public void setDltime(Date dltime) {
        this.dltime = dltime;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }
}
