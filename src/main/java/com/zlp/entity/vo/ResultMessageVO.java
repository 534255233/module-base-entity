package com.zlp.entity.vo;

import java.io.Serializable;

/**
 * 描述：统一返回消息
 * @author zhoulongpeng
 * @date   2016-02-16
 */
public class ResultMessageVO implements Serializable {
	
//	public final static int CODE_SUCCESS = 1;
//	public final static int CODE_ERROR = 0;
//	public final static int CODE_EXCEPTION = -1;
	
	/***/
	private static final long serialVersionUID = 1L;
	/**
	 * 错误代码
	 */
	private int code;
	/**
	 * 返回结果
	 * error:     失败
	 * success:   成功
	 * exception: 异常
	 */
	private String result;
	/**
	 * 错误信息
	 */
	private String message;
	
	public ResultMessageVO() {}
	
	public ResultMessageVO(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public ResultMessageVO(String result, String message) {
		this.result = result;
		this.message = message;
	}
	
	public ResultMessageVO(int code, String result, String message) {
		this.code = code;
		this.result = result;
		this.message = message;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
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
	
	/**
	 * 
	 * @author zhoulongpeng
	 * value:  code值
	 * des:    result对应的值
	 *
	 */
	public enum CodeEnum {
		
		SUCCESS("success", 1), ERROR("error", 0), EXCEPTION("exception", -1);
		
		private String des;
		
		private int value;
		
		private CodeEnum(String des, int value){
			this.des = des;
			this.value = value;
		}

		public String getDes() {
			return des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
	}
	

}
