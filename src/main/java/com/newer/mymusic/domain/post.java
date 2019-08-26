package com.newer.mymusic.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.io.Serializable;
//帖子表
public class post implements Serializable {
    private static final long serialVersionUID = -2762062934390694141L;
    private int Postid	;		//帖子id		主键		自增
    private String Posttitle;		// 帖子标题
    private String PostContent;	//帖子内容
    private String PostType;		// 帖子分类
    private String  Userid;		//发帖人
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Data Time;				//发帖时间
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public post() {
    }

    public post(int postid, String posttitle, String postContent, String postType, String userid, Data time, String x, int y, int z) {
        Postid = postid;
        Posttitle = posttitle;
        PostContent = postContent;
        PostType = postType;
        Userid = userid;
        Time = time;
        X = x;
        Y = y;
        Z = z;
    }

    public int getPostid() {
        return Postid;
    }

    public void setPostid(int postid) {
        Postid = postid;
    }

    public String getPosttitle() {
        return Posttitle;
    }

    public void setPosttitle(String posttitle) {
        Posttitle = posttitle;
    }

    public String getPostContent() {
        return PostContent;
    }

    public void setPostContent(String postContent) {
        PostContent = postContent;
    }

    public String getPostType() {
        return PostType;
    }

    public void setPostType(String postType) {
        PostType = postType;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

    public Data getTime() {
        return Time;
    }

    public void setTime(Data time) {
        Time = time;
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
