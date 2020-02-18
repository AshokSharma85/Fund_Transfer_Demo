package com.capgemini.validation;

public interface Validation {

	String pattern="[0-9]+";
	public static boolean check(String user,String pattern)
	{
		return user.matches(pattern);
	}
}
