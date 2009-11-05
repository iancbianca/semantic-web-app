package com.vanilla;

public class User2 
{
	private String name; 		   
	private int age; 		  
	private String country;
	public User2 (String name, int age, String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}	
	public String toString()
	{ 
		return "Hi" + name + "! You are " + age + " years old and live in " + country;
	}
}
