package com.newer.mymusic.domain;

import java.io.Serializable;

// 视频收藏表（根据用户id 查询个人收藏）
public class Videocollect implements Serializable {
    private static final long serialVersionUID = 178062011441050328L;
    private int  Collectionid;//收藏id		主键		自增
    private  int Videoid;		//视频id
    private  int Userid;		//用户id		个人表关联
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public Videocollect() {
    }

    public Videocollect(int collectionid, int videoid, int userid, String x, int y, int z) {
        Collectionid = collectionid;
        Videoid = videoid;
        Userid = userid;
        X = x;
        Y = y;
        Z = z;
    }

    public int getCollectionid() {
        return Collectionid;
    }

    public void setCollectionid(int collectionid) {
        Collectionid = collectionid;
    }

    public int getVideoid() {
        return Videoid;
    }

    public void setVideoid(int videoid) {
        Videoid = videoid;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
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
