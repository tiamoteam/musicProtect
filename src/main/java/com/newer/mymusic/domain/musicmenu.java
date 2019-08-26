package com.newer.mymusic.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

//歌单表（根据用户id 查询个人歌单）
public class musicmenu implements Serializable {

    private static final long serialVersionUID = 5128700201038743164L;
    private int songsheetid;	//歌单id
    private String songsheetname;	//歌单名称
    private int userid;	//用户id		个人表关联
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date songsheettime;	//歌单创建时间
    private int musicid;	//歌曲id		歌曲表关联
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3


    public musicmenu() {
    }

    public musicmenu(int songsheetid, String songsheetname, int userid, Date songsheettime, int musicid, String x, int y, int z) {
        this.songsheetid = songsheetid;
        this.songsheetname = songsheetname;
        this.userid = userid;
        this.songsheettime = songsheettime;
        this.musicid = musicid;
        X = x;
        Y = y;
        Z = z;
    }

    public int getSongsheetid() {
        return songsheetid;
    }

    public void setSongsheetid(int songsheetid) {
        this.songsheetid = songsheetid;
    }

    public String getSongsheetname() {
        return songsheetname;
    }

    public void setSongsheetname(String songsheetname) {
        this.songsheetname = songsheetname;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getSongsheettime() {
        return songsheettime;
    }

    public void setSongsheettime(Date songsheettime) {
        this.songsheettime = songsheettime;
    }

    public int getMusicid() {
        return musicid;
    }

    public void setMusicid(int musicid) {
        this.musicid = musicid;
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
