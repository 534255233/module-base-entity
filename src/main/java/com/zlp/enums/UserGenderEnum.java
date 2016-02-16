package com.zlp.enums;

public enum UserGenderEnum {
	
	MALE("男", 1), FEMALE("女", 0);
	
	private String des;
	private int    value;
	
	private UserGenderEnum(String des, int value) {
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
