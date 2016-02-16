package com.zlp.enums;

public enum UserOnlineStatusEnum {
	
	ONLINE("在线", 1), OFFLINE("下线", 0);
	
	private String des;
	private int    value;
	
	private UserOnlineStatusEnum(String des, int value) {
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
