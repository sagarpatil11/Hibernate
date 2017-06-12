package com.onetoone.Tester;

import com.onetoone.DAO.EmployeeDao;
import com.onetoone.DTO.AddressDto;
import com.onetoone.DTO.EmployeeDto;

public class Tester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AddressDto address1=new AddressDto();
		address1.setCity("Dhule");
		address1.setState("Maharashtra");
		
		EmployeeDto employee1=new EmployeeDto();
		employee1.setEname("tushar");
		employee1.setAddress(address1);
		
		address1.setEmployee(employee1);
		
		EmployeeDao empdao=new EmployeeDao();
		
		empdao.addEmployee(employee1);
		
		System.out.println("Data added");
	}

}
