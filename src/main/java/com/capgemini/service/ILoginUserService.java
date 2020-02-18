package com.capgemini.service;

public interface ILoginUserService {
	boolean validate(int userName,String password);
	boolean validateReceiver(int username);
	boolean validateUserAndRecieverService(int username,int userid);
}
