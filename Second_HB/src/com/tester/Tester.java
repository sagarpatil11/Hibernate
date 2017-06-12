package com.tester;

import com.DAO.EmployeeDao;
import com.DTO.EmployeeDto;

public class Tester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setId(90);
		employeeDto.setFirstname("Jagdish");
		employeeDto.setLastname("Nikam");
		
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.updateData(employeeDto);
		
		System.out.println("Update successfull");
		

	}

}
