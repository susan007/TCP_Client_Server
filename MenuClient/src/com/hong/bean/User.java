package com.hong.bean;

/**
 * �û���Ϣ
 * @author susan
 *
 */
public class User {
	/**** �������ֻ��Ż������� ****/
	private String userName;
	/**** ������ʮλ��ֻ�������� ****/
	private String userPassword;
	/**** �û���ͷ�� ****/
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
