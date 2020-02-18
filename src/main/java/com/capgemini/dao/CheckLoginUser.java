package com.capgemini.dao;

import com.capgemini.util.ToAddUser;

public class CheckLoginUser implements ICheckLoginUserDao {

	ToAddUser obejctOfToAddUser=new ToAddUser();

	@Override
	public boolean checkLogin(int userName, String password) {

		return obejctOfToAddUser.checkUserExistence(userName,password);
    }

	@Override
	public boolean checkReceiver(int username) {
		return obejctOfToAddUser.checkRec(username);
		
	}

	@Override
	public boolean validateUserAndRecieverDao(int username, int userid) {
		boolean flag=true;	
		return username!=userid?flag:!flag;
		
	}
	
}
