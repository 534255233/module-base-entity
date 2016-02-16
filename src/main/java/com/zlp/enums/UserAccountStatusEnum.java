package com.zlp.enums;

public enum UserAccountStatusEnum {
	
	ENABLED("启用", 1), DISABLED("禁用", 0);
	
	private String des;
	private int    value;
	
	private UserAccountStatusEnum(String des, int value) {
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
