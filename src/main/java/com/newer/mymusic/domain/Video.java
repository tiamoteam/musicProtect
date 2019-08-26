package com.newer.mymusic.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

//视频表
public class Video implements Serializable {

    private static final long serialVersionUID = 1603264114059735433L;
    private  int VideoID; //视频id         主键		自增
    private String  Videoname;	 //视频名字		视频收藏表关联
    private  int  Userid;	//上传用户	个人中心表关联
    private String  Videointro;//视屏简介
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date Videotime;//上传时间
    private String  Videourl;//视频地址
    private String X;	//备用1
    private String Y;	//备用2
    private String Z; //备用3

    public Video() {
    }

    public Video(int videoID, String videoname, int userid, String videointro, Date videotime, String videourl, String x, String y, String z) {
        VideoID = videoID;
        Videoname = videoname;
        Userid = userid;
        Videointro = videointro;
        Videotime = videotime;
        Videourl = videourl;
        X = x;
        Y = y;
        Z = z;
    }

    public int getVideoID() {
        return VideoID;
    }

    public void setVideoID(int videoID) {
        VideoID = videoID;
    }

    public String getVideoname() {
        return Videoname;
    }

    public void setVideoname(String videoname) {
        Videoname = videoname;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getVideointro() {
        return Videointro;
    }

    public void setVideointro(String videointro) {
        Videointro = videointro;
    }

    public Date getVideotime() {
        return Videotime;
    }

    public void setVideotime(Date videotime) {
        Videotime = videotime;
    }

    public String getVideourl() {
        return Videourl;
    }

    public void setVideourl(String videourl) {
        Videourl = videourl;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public String getY() {
        return Y;
    }

    public void setY(String y) {
        Y = y;
    }

    public String getZ() {
        return Z;
    }

    public void setZ(String z) {
        Z = z;
    }
}
