package com.capgemini.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.capgemini.service.BalanceOperationsService;
import com.capgemini.service.LoginUserService;

class TestingForService {
	BalanceOperationsService objectOfBalanceOperationsService=new BalanceOperationsService();
	LoginUserService objectOfLoginUserService=new LoginUserService();
	
	@Test
	public void validateUserTest()
	{ 
		int userName=561236;
		String password="ask123";
		assertEquals(true,objectOfLoginUserService.validate(userName,password));
	}
	
	@Test
	public void validateReceiverTest()
	{
		int username=561236;
	  assertEquals(true,objectOfLoginUserService.validateReceiver(username));
	}
	
	@Test
	public void validateUserAndRecieverServiceTest()
	{
		int usernameOfReceiver=561236;
		int usernameOfSender=562830;
		assertEquals(true,objectOfLoginUserService.validateUserAndRecieverService(usernameOfSender,usernameOfReceiver));
	}
	
	@Test
	public void checkWalletBalanceTest()
	{
		int username=561236;
		double amount=500;
		assertEquals(true,objectOfBalanceOperationsService.checkWalletBalance(username, amount));
	}
	
}
