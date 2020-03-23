package com.capgemini.dao;

import java.util.Map;

import com.capgemini.bean.Users;
import com.capgemini.util.ToAddUser;

public class CheckLoginUserDao implements ICheckLoginUserDao {

	ToAddUser obejctOfToAddUser=new ToAddUser();
	Map<Integer, Users> users=obejctOfToAddUser.userInfo();
	
	@Override
	public boolean checkLogin(int userName, String password) {
		if(users.containsKey(userName))
		{ 
			String pass=users.get(userName).getPassword();
			if(pass.equals(password))
				return true;	
		}
		return false;
    }

	@Override
	public boolean checkReceiverDao(int username) {
		boolean flag=true;
		return users.containsKey(username)?flag:!flag;
	}

	@Override
	public boolean validateUserAndRecieverDao(int userNameOfSender, int userNameOfReceiver) {
		boolean flag=true;	
		return userNameOfSender!=userNameOfReceiver?flag:!flag;
		
	}
	
}
