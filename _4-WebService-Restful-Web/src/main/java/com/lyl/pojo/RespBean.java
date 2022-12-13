package com.lyl.pojo;

/**
 * 功能：消息响应类
 *
 * @author 林亦亮
 * @version 1.0
 * @date 2022/12/1
 */

public class RespBean {
	private int code;
	private String message;
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
