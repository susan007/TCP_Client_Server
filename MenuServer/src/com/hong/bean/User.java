package com.hong.bean;

/**
 * 用户信息类
 * @author susan
 *
 */
public class User {
	/****可以是手机号或者邮箱****/
	private String userName;
	/****不超过十位，只能是数字****/
	private String userPassword;
	/****用户的头像****/
	private String userImg="default.jpg";
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

}
