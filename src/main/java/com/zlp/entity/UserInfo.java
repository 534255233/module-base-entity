package com.zlp.entity;

import java.io.Serializable;

/**
 * 描述：用户基本信息
 * @author zhoulongpeng
 * @date   2016-02-13
 */
public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * User表ID
	 */
	private String _id;
	
	/**
	 * 用户真是姓名
	 */
	private String name;
	/**
	 * 账户金额
	 */
	private double balance;
	/**
	 * 性别 UserGenderEnum 表示
	 */
	private int gender;
	
	private String hometown;
	
	/**
	 * 职位id 修改于2014-10-16
	 * 职位［普通用户，管理员, ...］
	 */
	private String positionId;
	/**
	 * 部门id
	 */
	private String orgId;
	/**
	 * 1 只看到自己的业务数据，0 看到全部数据
	private int myseft;*/
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
}
