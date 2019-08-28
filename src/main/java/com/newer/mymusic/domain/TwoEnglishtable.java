package com.newer.mymusic.domain;

import java.io.Serializable;
//二十六个英文字母表
public class TwoEnglishtable implements Serializable {
    private static final long serialVersionUID = 5733674088341686834L;
    private int Englishid;  	//英文id
    private String English;	//单词
    private String X;	//备用1
    private int Y;		//备用2
    private int Z;		//备用3

    public TwoEnglishtable() {
    }

    public TwoEnglishtable(int englishid, String english, String x, int y, int z) {
        Englishid = englishid;
        English = english;
        X = x;
        Y = y;
        Z = z;
    }

    public int getEnglishid() {
        return Englishid;
    }

    public void setEnglishid(int englishid) {
        Englishid = englishid;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
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
