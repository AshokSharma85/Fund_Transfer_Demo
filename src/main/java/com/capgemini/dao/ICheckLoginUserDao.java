package com.capgemini.dao;

public interface ICheckLoginUserDao {

	boolean checkLogin(int userName,String password);
	boolean checkReceiver(int username);
	boolean validateUserAndRecieverDao(int username,int userid);
}
