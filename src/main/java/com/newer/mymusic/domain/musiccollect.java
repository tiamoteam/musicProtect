package com.newer.mymusic.domain;

import java.io.Serializable;
//歌曲收藏表（根据用户id 查询个人收藏）
public class musiccollect implements Serializable {
    private static final long serialVersionUID = -8898576872191254417L;
    private int Collectionid;	//收藏id		主键			自增
    private int MusicID ;  //歌曲id 		歌曲表关联
    private int Userid;	//收藏者id		个人表关联
    private String X;		//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public musiccollect() {
    }

    public musiccollect(int collectionid, int musicID, int userid, String x, int y, int z) {
        Collectionid = collectionid;
        MusicID = musicID;
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

    public int getMusicID() {
        return MusicID;
    }

    public void setMusicID(int musicID) {
        MusicID = musicID;
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
