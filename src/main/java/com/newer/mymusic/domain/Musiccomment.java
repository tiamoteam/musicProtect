package com.newer.mymusic.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

//歌曲评论表
public class Musiccomment implements Serializable {
    private static final long serialVersionUID = -3254073086068367670L;
    private int  MusicReviewid;//评论id		主键		自增
    private String Contents;//评论内容
    private int MusicID;//歌曲id		歌曲表关联
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date ReviewTime;//评论时间
    private int Userid;//用户id		个人表关联
    private String X;   //备用1
    private int Y;		//备用2
    private int Z;	    //备用3

    public Musiccomment() {
    }

    public Musiccomment(int musicReviewid, String contents, int musicID, Date reviewTime, int userid, String x, int y, int z) {
        MusicReviewid = musicReviewid;
        Contents = contents;
        MusicID = musicID;
        ReviewTime = reviewTime;
        Userid = userid;
        X = x;
        Y = y;
        Z = z;
    }

    public int getMusicReviewid() {
        return MusicReviewid;
    }

    public void setMusicReviewid(int musicReviewid) {
        MusicReviewid = musicReviewid;
    }

    public String getContents() {
        return Contents;
    }

    public void setContents(String contents) {
        Contents = contents;
    }

    public int getMusicID() {
        return MusicID;
    }

    public void setMusicID(int musicID) {
        MusicID = musicID;
    }

    public Date getReviewTime() {
        return ReviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        ReviewTime = reviewTime;
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
