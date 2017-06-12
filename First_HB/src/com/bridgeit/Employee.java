package com.bridgeit;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int id;
	private String firstname,lastname;
	
	public Employee()
	{
		System.out.println(getClass().getSimpleName());
	}
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getFirstname() 
	{
		return firstname;
	}
	
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	
	public String getLastname() 
	{
		return lastname;
	}
	
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	
	
}
