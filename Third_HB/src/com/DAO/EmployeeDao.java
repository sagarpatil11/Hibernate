package com.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.DTO.EmployeeDto;

public class EmployeeDao 
{
	public void delete(EmployeeDto emp)
	{
		Session session=new AnnotationConfiguration()
							.configure().buildSessionFactory().openSession();
		
		Transaction t=session.beginTransaction();
		session.delete(emp);
		t.commit();
		session.close();
	}
}
