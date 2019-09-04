package com.newer.mymusic.domain;
//歌曲表
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Musictable implements Serializable {
    private static final long serialVersionUID = -5549869706689388244L;
    private int MusicID ;//歌曲id
    private String  Musicname;	   //歌曲名字
    private  String Musicalgenre1;	//歌曲流派1
    private  String Musicalgenre2;	//歌曲流派2
    private  String Musicalgenre3;	//歌曲流派3
    private  String Musicalgenre4;	//歌曲流派4
    private String Musicintro;		//歌曲简介
    private int Userid;		//上传用户
    private int MusicCollection; 	 //收藏次数
    private int MusicalCompliments; 	//点赞次数
    private String Singer;	//歌手
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date Musictime;//上传时间
    private Date MusicBeformtime; //最近播放时间
    private int Musicnum;		//歌曲播放次数
    private String Musicurl;	//歌曲地址
    private String X;	//备用1
    private String Y;	//备用2
    private String Z; //备用3

    public Musictable() {
    }

    public String getMusicalgenre1() {
        return Musicalgenre1;
    }

    public void setMusicalgenre1(String musicalgenre1) {
        Musicalgenre1 = musicalgenre1;
    }

    public String getMusicalgenre2() {
        return Musicalgenre2;
    }

    public void setMusicalgenre2(String musicalgenre2) {
        Musicalgenre2 = musicalgenre2;
    }

    public String getMusicalgenre3() {
        return Musicalgenre3;
    }

    public void setMusicalgenre3(String musicalgenre3) {
        Musicalgenre3 = musicalgenre3;
    }

    public String getMusicalgenre4() {
        return Musicalgenre4;
    }

    public void setMusicalgenre4(String musicalgenre4) {
        Musicalgenre4 = musicalgenre4;
    }

    public int getMusicID() {
        return MusicID;
    }

    public void setMusicID(int musicID) {
        MusicID = musicID;
    }

    public String getMusicname() {
        return Musicname;
    }

    public void setMusicname(String musicname) {
        Musicname = musicname;
    }

    public String getMusicintro() {
        return Musicintro;
    }

    public void setMusicintro(String musicintro) {
        Musicintro = musicintro;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public int getMusicCollection() {
        return MusicCollection;
    }

    public void setMusicCollection(int musicCollection) {
        MusicCollection = musicCollection;
    }

    public int getMusicalCompliments() {
        return MusicalCompliments;
    }

    public void setMusicalCompliments(int musicalCompliments) {
        MusicalCompliments = musicalCompliments;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public Date getMusictime() {
        return Musictime;
    }

    public void setMusictime(Date musictime) {
        Musictime = musictime;
    }

    public Date getMusicBeformtime() {
        return MusicBeformtime;
    }

    public void setMusicBeformtime(Date musicBeformtime) {
        MusicBeformtime = musicBeformtime;
    }

    public int getMusicnum() {
        return Musicnum;
    }

    public void setMusicnum(int musicnum) {
        Musicnum = musicnum;
    }

    public String getMusicurl() {
        return Musicurl;
    }

    public void setMusicurl(String musicurl) {
        Musicurl = musicurl;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public String getY() {
        return Y;
    }

    public void setY(String y) {
        Y = y;
    }

    public String getZ() {
        return Z;
    }

    public void setZ(String z) {
        Z = z;
    }
}
