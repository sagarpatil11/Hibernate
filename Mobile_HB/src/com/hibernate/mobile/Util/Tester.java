package com.hibernate.mobile.Util;



import com.hibernate.mobile.DAO.MobileDao;
import com.hibernate.mobile.DTO.MobileDto;

public class Tester 
{
	public static void main(String[] args) 
	{
		MobileDto mobileDto=new MobileDto();
		/*mobileDto.setId(5);
		mobileDto.setComp_name("Lenovo");
		mobileDto.setModel_no("v5");
		mobileDto.setPrice(9000);*/
		
		MobileDao mobileDao=new MobileDao();
		//mobileDao.add_data(mobileDto);
		//System.out.println("Data added successfully");
		//System.out.println("Data is:");
		//mobileDao.display();
		System.out.println("\n Company name:");
		mobileDao.displayCompanyName();
	}
}
