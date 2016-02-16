package com.zlp.entity.vo;

import java.io.Serializable;

/**
 * 描述：统一返回消息
 * @author zhoulongpeng
 * @date   2016-02-16
 */
public class ResultMessageVO implements Serializable {
	
	public final static int CODE_SUCCESS = 1;
	public final static int CODE_ERROR = 0;
	public final static int CODE_EXCEPTION = -1;
	
	/***/
	private static final long serialVersionUID = 1L;
	/**
	 * 错误代码
	 */
	private int code;
	/**
	 * 错误信息
	 */
	private String message;
	
	public ResultMessageVO() {}
	
	public ResultMessageVO(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
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
	

}
