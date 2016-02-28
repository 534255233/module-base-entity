package com.zlp.exception;

public class UserExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserExistsException(String msg) {
		super(msg);
	}
	
	public UserExistsException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
