package com.capgemini.util;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;


import com.capgemini.bean.Transaction;
import com.capgemini.bean.Users;

public class AllTransaction {
	ToAddUser objectOfToAddUser=new ToAddUser();
	
	Map<Integer,Users> copyOfUsersMap=objectOfToAddUser.userInfo();
   
	private static List <Transaction> listToStoreTransaction=new ArrayList<>();
	
	public List<Transaction> listInfo() 
	{  
		return listToStoreTransaction;
	}
	
}
