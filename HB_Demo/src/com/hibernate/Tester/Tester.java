package com.hibernate.Tester;

import com.hibernate.DAO.CarDao;
import com.hibernate.DTO.CarDto;

public class Tester {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			CarDto carDto=new CarDto();
			carDto.setCname("BMW");
			carDto.setModel("ZX");
			carDto.setPrice(6500000);
			
			CarDao carDao=new CarDao();
			carDao.addCar(carDto);
			System.out.println("Data Added successfully");
	}

}
