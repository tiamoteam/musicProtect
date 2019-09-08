package com.newer.mymusic.domain;

import java.io.Serializable;

//帖子图片表
public class PostPrice implements Serializable {
    private static final long serialVersionUID = -3608375119835402358L;
    private  int Ppid; //图片id
    private int  Postid; //帖子id
    private String Pp1;//图片1
    private String PP2;
    private String PP3;
    private String PP4;
    private String  PP5;
    private String  PP6;
    private String  PP7;
    private String  PP9;
    private String  PP8;
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public PostPrice() {
    }

    public PostPrice(int ppid, int postid, String pp1, String PP2, String PP3, String PP4, String PP5, String PP6, String PP7, String PP8, String PP9, String x, int y, int z) {
        Ppid = ppid;
        Postid = postid;
        Pp1 = pp1;
        this.PP2 = PP2;
        this.PP3 = PP3;
        this.PP4 = PP4;
        this.PP5 = PP5;
        this.PP6 = PP6;
        this.PP7 = PP7;
        this.PP8 = PP8;
        this.PP9 = PP9;
        X = x;
        Y = y;
        Z = z;
    }

    public int getPpid() {
        return Ppid;
    }

    public void setPpid(int ppid) {
        Ppid = ppid;
    }

    public int getPostid() {
        return Postid;
    }

    public void setPostid(int postid) {
        Postid = postid;
    }

    public String getPp1() {
        return Pp1;
    }

    public void setPp1(String pp1) {
        Pp1 = pp1;
    }

    public String getPP2() {
        return PP2;
    }

    public void setPP2(String PP2) {
        this.PP2 = PP2;
    }

    public String getPP3() {
        return PP3;
    }

    public void setPP3(String PP3) {
        this.PP3 = PP3;
    }

    public String getPP4() {
        return PP4;
    }

    public void setPP4(String PP4) {
        this.PP4 = PP4;
    }

    public String getPP5() {
        return PP5;
    }

    public void setPP5(String PP5) {
        this.PP5 = PP5;
    }

    public String getPP6() {
        return PP6;
    }

    public void setPP6(String PP6) {
        this.PP6 = PP6;
    }

    public String getPP7() {
        return PP7;
    }

    public void setPP7(String PP7) {
        this.PP7 = PP7;
    }

    public String getPP8() {
        return PP8;
    }

    public void setPP8(String PP8) {
        this.PP8 = PP8;
    }

    public String getPP9() {
        return PP9;
    }

    public void setPP9(String PP9) {
        this.PP9 = PP9;
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
