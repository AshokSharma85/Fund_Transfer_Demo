package com.capgemini.service;

import com.capgemini.dao.CheckLoginUser;


public class LoginUserService implements ILoginUserService {

	CheckLoginUser objectOfCheckLoginUser=new CheckLoginUser();

	@Override
	public boolean validate(int userName, String password) {
		return objectOfCheckLoginUser.checkLogin(userName,password);
		
	}

	@Override
	public boolean validateReceiver(int username) {

		return objectOfCheckLoginUser.checkReceiver(username);
	}

	@Override
	public boolean validateUserAndRecieverService(int username, int userid) {
		return objectOfCheckLoginUser.validateUserAndRecieverDao(username,userid);
	}
	
	
}

