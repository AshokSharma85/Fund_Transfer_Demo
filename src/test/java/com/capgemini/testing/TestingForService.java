package com.capgemini.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.capgemini.service.ServiceClass;
import com.capgemini.service.LoginUserService;
import com.capgemini.validation.Validation;

class TestingForService {
	ServiceClass objectOfBalanceOperationsService=new ServiceClass();
	LoginUserService objectOfLoginUserService=new LoginUserService();
	@Test
	public void validateUserTest()
	{ 
		int userName=1001;
		String password="ask123";
		boolean b=objectOfLoginUserService.validate(userName, password);
		assertEquals(true,b);
	}
	
	@Test
	public void validateReceiverTest()
	{
		int username=1001;
	  assertEquals(true,objectOfLoginUserService.validateReceiver(username));
	}
 /*
  * If username of sender and receiver is same then it will write false otherwise true will be written
  */

	@Test
	public void validateUserAndRecieverServiceTest()
	{
		int usernameOfReceiver=1001;
		int usernameOfSender=1001;
		assertEquals(true,objectOfLoginUserService.validateUserAndRecieverService(usernameOfSender,usernameOfReceiver));
	}
	
	@Test
	public void checkWalletBalanceTest()
	{
		int username=1001;
		double amount=500;
		assertEquals(true,objectOfBalanceOperationsService.checkWalletBalance(username, amount));
	}

	//Testcases for Validation
	
	@Test
	public void validateCheker()
	{
		assertEquals(true, Validation.check("123", Validation.pattern));
	}
	
	//Testing of return type String method
	@Test
	public void balanceOfWalTest()
	{
		assertEquals("Your Wallet Balance is 1500.0",objectOfBalanceOperationsService.balanceOfWal(561236));
	}
	
	@Test
	public void balanceOfBankTesting()
	{
		assertEquals("Your Bank Balance is 10000.0",objectOfBalanceOperationsService.balanceOfBank(561236));
	}
}