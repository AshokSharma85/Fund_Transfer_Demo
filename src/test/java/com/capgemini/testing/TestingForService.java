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
		boolean b=objectOfLoginUserService.validate(userName, password);
		assertEquals(true,b);
	}
	
	@Test
	public void validateReceiverTest()
	{
		int username=56123;
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
