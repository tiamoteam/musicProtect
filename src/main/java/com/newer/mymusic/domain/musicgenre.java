package com.newer.mymusic.domain;

import java.io.Serializable;

//歌曲流派表
public class musicgenre implements Serializable {
    private static final long serialVersionUID = -7541914075017872308L;
    private int genreID;	//流派ID
    private String Musicalgenre;	//歌曲流派	  歌曲表关联
    private String Genreportrait;	//流派图片
    private String Genreintro;		//流派简介
    private int Genrenum;		//派播放次数
    private int MusicID;   //歌曲id   歌曲表关联
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3


    public musicgenre() {
    }

    public musicgenre(int genreID, String musicalgenre, String genreportrait, String genreintro, int genrenum, int musicID, String x, int y, int z) {
        this.genreID = genreID;
        Musicalgenre = musicalgenre;
        Genreportrait = genreportrait;
        Genreintro = genreintro;
        Genrenum = genrenum;
        MusicID = musicID;
        X = x;
        Y = y;
        Z = z;
    }

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public String getMusicalgenre() {
        return Musicalgenre;
    }

    public void setMusicalgenre(String musicalgenre) {
        Musicalgenre = musicalgenre;
    }

    public String getGenreportrait() {
        return Genreportrait;
    }

    public void setGenreportrait(String genreportrait) {
        Genreportrait = genreportrait;
    }

    public String getGenreintro() {
        return Genreintro;
    }

    public void setGenreintro(String genreintro) {
        Genreintro = genreintro;
    }

    public int getGenrenum() {
        return Genrenum;
    }

    public void setGenrenum(int genrenum) {
        Genrenum = genrenum;
    }

    public int getMusicID() {
        return MusicID;
    }

    public void setMusicID(int musicID) {
        MusicID = musicID;
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
