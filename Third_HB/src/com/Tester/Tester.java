package com.Tester;

import com.DAO.EmployeeDao;
import com.DTO.EmployeeDto;

public class Tester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setId(90);
		
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.delete(employeeDto);
		
		System.out.println("Data Successfully deleted");
	}

}
