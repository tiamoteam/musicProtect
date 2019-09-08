package com.newer.mymusic.domain;

import java.io.Serializable;
import java.util.Date;

public class Postcomment implements Serializable {
    private static final long serialVersionUID = 3764597686279897902L;
    private int atomid; //评论id
    private String comments; //评论内容
    private int postid; //帖子id
    private Date atomtime; //评论时间
    private int userid; //用户id;

    public Postcomment() {
    }

    public Postcomment(int atomid, String comments, int postid, Date atomtime, int userid) {
        this.atomid = atomid;
        this.comments = comments;
        this.postid = postid;
        this.atomtime = atomtime;
        this.userid = userid;
    }

    public int getAtomid() {
        return atomid;
    }

    public void setAtomid(int atomid) {
        this.atomid = atomid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public Date getAtomtime() {
        return atomtime;
    }

    public void setAtomtime(Date atomtime) {
        this.atomtime = atomtime;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
