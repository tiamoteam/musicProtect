package com.newer.mymusic.domain;

import java.io.Serializable;
//视频弹幕表
public class Videoscreen implements Serializable {
    private static final long serialVersionUID = -5219271783928240227L;
    private  int VBarrageID;	//视频弹幕ID  	主键 		自增
    private int  VideoID;    //视频id  		视频表关联
    private int  Userid;		//用户ID			用户表关联
    private  String Barrage;	//弹幕内容
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public Videoscreen() {
    }

    public Videoscreen(int VBarrageID, int videoID, int userid, String barrage, String x, int y, int z) {
        this.VBarrageID = VBarrageID;
        VideoID = videoID;
        Userid = userid;
        Barrage = barrage;
        X = x;
        Y = y;
        Z = z;
    }

    public int getVBarrageID() {
        return VBarrageID;
    }

    public void setVBarrageID(int VBarrageID) {
        this.VBarrageID = VBarrageID;
    }

    public int getVideoID() {
        return VideoID;
    }

    public void setVideoID(int videoID) {
        VideoID = videoID;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getBarrage() {
        return Barrage;
    }

    public void setBarrage(String barrage) {
        Barrage = barrage;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        Z = z;
    }
}
