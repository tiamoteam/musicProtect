package com.newer.mymusic.domain;
//歌曲表
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class musictable implements Serializable {
    private static final long serialVersionUID = -5549869706689388244L;
    private int MusicID ;//歌曲id
    private String  Musicname;	   //歌曲名字
    private  String Musicalgenre;	//歌曲流派
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

    public musictable() {
    }

    public musictable(int musicID, String musicname, String musicalgenre, String musicintro, int userid, int musicCollection, int musicalCompliments, String singer, Date musictime, Date musicBeformtime, int musicnum, String musicurl, String x, String y, String z) {
        MusicID = musicID;
        Musicname = musicname;
        Musicalgenre = musicalgenre;
        Musicintro = musicintro;
        Userid = userid;
        MusicCollection = musicCollection;
        MusicalCompliments = musicalCompliments;
        Singer = singer;
        Musictime = musictime;
        MusicBeformtime = musicBeformtime;
        Musicnum = musicnum;
        Musicurl = musicurl;
        X = x;
        Y = y;
        Z = z;
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

    public String getMusicalgenre() {
        return Musicalgenre;
    }

    public void setMusicalgenre(String musicalgenre) {
        Musicalgenre = musicalgenre;
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
