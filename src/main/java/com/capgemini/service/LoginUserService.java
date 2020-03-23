package com.capgemini.service;

import com.capgemini.dao.CheckLoginUserDao;


public class LoginUserService implements ILoginUserService {

	CheckLoginUserDao objectOfCheckLoginUser=new CheckLoginUserDao();
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

		return objectOfCheckLoginUser.checkReceiverDao(username);
	}
	/*
	 *This method will check whether user is trying to send the money to himself/herself or not	 
	 */
	@Override
	public boolean validateUserAndRecieverService(int userNameOfSender, int userNameOfReceiver) {
		return objectOfCheckLoginUser.validateUserAndRecieverDao(userNameOfSender,userNameOfReceiver);
	}
	
	
}

