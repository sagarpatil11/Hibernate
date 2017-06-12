package com.onetoone.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.onetoone.DTO.AddressDto;
import com.onetoone.DTO.EmployeeDto;

public class EmployeeDao 
{
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	public void addEmployee(EmployeeDto emp)
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(emp);
		t.commit();
		session.close();
	}
	
	public void addEmployee(AddressDto add)
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(add);
		t.commit();
		session.close();
	}
}
