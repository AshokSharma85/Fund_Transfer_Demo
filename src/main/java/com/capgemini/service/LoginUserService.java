package com.capgemini.service;

import com.capgemini.dao.CheckLoginUser;


public class LoginUserService implements ILoginUserService {

	CheckLoginUser objectOfCheckLoginUser=new CheckLoginUser();
		/*
		 * This method will check the username and password which is written by user after validation 
		 * if data is in collection then it will return true other it will written false
		*/
	@Override
	public boolean validate(int userName, String password) {
		return objectOfCheckLoginUser.checkLogin(userName,password);
		
	}
		/*
		 * For transferring money if receiver user is present is not it will give result according to this in boolean
		*/
	@Override
	public boolean validateReceiver(int username) {

		return objectOfCheckLoginUser.checkReceiver(username);
	}
	/*
	 *This method will check whether user is trying to send the money to himself/herself or not	 
	 */
	@Override
	public boolean validateUserAndRecieverService(int username, int userid) {
		return objectOfCheckLoginUser.validateUserAndRecieverDao(username,userid);
	}
	
	
}

