package com.newer.mymusic.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.io.Serializable;
//帖子评论表
public class postcomment implements Serializable {
    private static final long serialVersionUID = 2565712283198216400L;
    private int Atomid;		//评论id		主键		自增
    private String  Contents;		//评论内容
    private  int postID;		//帖子id		帖子关联
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Data AtomTime;			//评论时间
    private int  Userid;			//用户id		个人表关联
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public postcomment() {
    }

    public postcomment(int atomid, String contents, int postID, Data atomTime, int userid, String x, int y, int z) {
        Atomid = atomid;
        Contents = contents;
        this.postID = postID;
        AtomTime = atomTime;
        Userid = userid;
        X = x;
        Y = y;
        Z = z;
    }

    public int getAtomid() {
        return Atomid;
    }

    public void setAtomid(int atomid) {
        Atomid = atomid;
    }

    public String getContents() {
        return Contents;
    }

    public void setContents(String contents) {
        Contents = contents;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public Data getAtomTime() {
        return AtomTime;
    }

    public void setAtomTime(Data atomTime) {
        AtomTime = atomTime;
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
