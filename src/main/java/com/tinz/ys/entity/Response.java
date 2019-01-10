package com.tinz.ys.entity;

public class Response {
    public static int OK = 0;
    public static int FAIL = 1;

    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Response() {

    }

    public Response(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public void setMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        //this.data = "no data";
    }

    public void setMsg(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    
    public void setMsg(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }
}
