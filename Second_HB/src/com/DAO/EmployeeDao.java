package com.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.DTO.EmployeeDto;

public class EmployeeDao 
{
	public void updateData(EmployeeDto emp) 
	{
		  Session session=new AnnotationConfiguration()  
			         .configure().buildSessionFactory().openSession();  
			      
			    Transaction t=session.beginTransaction();  
			    session.update(emp);
			    t.commit();
			    session.close();

	}
}
