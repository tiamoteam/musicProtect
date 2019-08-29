package com.newer.mymusic.domain;

import java.io.Serializable;

public class ResponseDate implements Serializable {

    private static final long serialVersionUID = -526036979973216088L;
    private String code;
    private String msg;

    public ResponseDate() {
    }

    public ResponseDate(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
