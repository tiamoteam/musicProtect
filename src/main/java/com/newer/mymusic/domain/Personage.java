package com.newer.mymusic.domain;

import java.io.Serializable;
//个人表
public class Personage implements Serializable {
    private static final long serialVersionUID = 4094012456050356183L;
    private int Userid;      	//用户id          主键			自增
    private String UserName;			//用户登录账户
    private String Userpwd;			//用户登录密码
    private String Name;				//用户名字
    private int State;				//状态
    private String  Headportrait;		//头像
    private String  Address;			//地址
    private int Fans;				//粉丝数
    private int compliments;		//被点赞次数
    private String sex;				//性别
    private String phone;				//电话
    private int age;				//年龄
    private String email;
    private String PersonalSignature;	//个性签名
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public Personage() {
    }

    public Personage(int userid, String userName, String userpwd, String name, int state, String headportrait, String address, int fans, int compliments, String sex, String phone, int age, String email, String personalSignature, String x, int y, int z) {
        Userid = userid;
        UserName = userName;
        Userpwd = userpwd;
        Name = name;
        State = state;
        Headportrait = headportrait;
        Address = address;
        Fans = fans;
        this.compliments = compliments;
        this.sex = sex;
        this.phone = phone;
        this.age = age;
        this.email = email;
        PersonalSignature = personalSignature;
        X = x;
        Y = y;
        Z = z;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserpwd() {
        return Userpwd;
    }

    public void setUserpwd(String userpwd) {
        Userpwd = userpwd;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getFans() {
        return Fans;
    }

    public void setFans(int fans) {
        Fans = fans;
    }

    public int getCompliments() {
        return compliments;
    }

    public void setCompliments(int compliments) {
        this.compliments = compliments;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
