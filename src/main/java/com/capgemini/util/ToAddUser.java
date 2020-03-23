package com.capgemini.util;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.bean.Users;

public class ToAddUser {
	    
	private static Map<Integer,Users> users=new HashMap<>();
	static {
		users.put(1001,new Users("Ashok","ask123","8974561236",10000,1500));
		users.put(1002,new Users("Sachin","Sac123","9874562830",20000,5890));
		users.put(1003, new Users("AJay","Ajay123","7956841208",15000,7890));
		users.put(1004,new Users("Ravi","ravi123","7841523790",30000,1890));
		users.put(1005,new Users("Vivek","Viv123","9687451203",22000,8390));    
	}
	
	public Map<Integer,Users> userInfo()
	{
		return users;
	}

}
