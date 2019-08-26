package com.newer.mymusic.domain;

import java.io.Serializable;
//好友表
public class friends implements Serializable {
    private static final long serialVersionUID = -2023816473221067773L;
    private  int Friendid;			//好友id		主键		自增
    private String  Friendname;		//	好友名字
    private int  Userid;			//用户id		个人表关联
    private int  State;			//好友状态
    private  String  Headportrait;		//好友头像
    private  String PersonalSignature	; //好友个性签名
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public friends() {
    }

    public friends(int friendid, String friendname, int userid, int state, String headportrait, String personalSignature, String x, int y, int z) {
        Friendid = friendid;
        Friendname = friendname;
        Userid = userid;
        State = state;
        Headportrait = headportrait;
        PersonalSignature = personalSignature;
        X = x;
        Y = y;
        Z = z;
    }

    public int getFriendid() {
        return Friendid;
    }

    public void setFriendid(int friendid) {
        Friendid = friendid;
    }

    public String getFriendname() {
        return Friendname;
    }

    public void setFriendname(String friendname) {
        Friendname = friendname;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public String getHeadportrait() {
        return Headportrait;
    }

    public void setHeadportrait(String headportrait) {
        Headportrait = headportrait;
    }

    public String getPersonalSignature() {
        return PersonalSignature;
    }

    public void setPersonalSignature(String personalSignature) {
        PersonalSignature = personalSignature;
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

