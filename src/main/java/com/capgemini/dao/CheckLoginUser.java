package com.capgemini.dao;

import com.capgemini.util.ToAddUser;

public class CheckLoginUser implements ICheckLoginUserDao {

	ToAddUser obejctOfToAddUser=new ToAddUser();

	@Override
	public boolean checkLogin(int userName, String password) {

		return obejctOfToAddUser.checkUserExistence(userName,password);
    }

	@Override
	public boolean CheckReceiver(int username) {
		return obejctOfToAddUser.checkRec(username);
		
	}

	@Override
	public boolean validateUserAndRecieverDao(int username, int userid) {
		//if(username.equals(userid))
				if(username==userid)
					return false;
				return true;
				//return false;
	}
	
}
