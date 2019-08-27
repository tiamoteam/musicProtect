package com.newer.mymusic.domain;

import java.io.Serializable;
//帖子类别表
public class posttypetable implements Serializable {
    private static final long serialVersionUID = -6851473669000358831L;
    private int Posttypeid; //分类id
    private String  Posttype; //帖子类别
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public posttypetable() {
    }

    public posttypetable(int posttypeid, String posttype, String x, int y, int z) {
        Posttypeid = posttypeid;
        Posttype = posttype;
        X = x;
        Y = y;
        Z = z;
    }

    public int getPosttypeid() {
        return Posttypeid;
    }

    public void setPosttypeid(int posttypeid) {
        Posttypeid = posttypeid;
    }

    public String getPosttype() {
        return Posttype;
    }

    public void setPosttype(String posttype) {
        Posttype = posttype;
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
