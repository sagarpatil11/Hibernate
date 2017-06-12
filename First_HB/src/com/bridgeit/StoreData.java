package com.bridgeit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  Configuration cfg=new Configuration();
		  cfg.configure("hibernate.cfg.xml");
	
		  SessionFactory factory=cfg.buildSessionFactory();
		  
		  Session session=factory.openSession();
		  
		  Transaction transaction=session.beginTransaction();
		  
		  Employee e1=new Employee();
		  e1.setId(101);
		  e1.setFirstname("Sagar");
		  e1.setLastname("Patil");
		  
		  session.persist(e1);
		  
		  transaction.commit();
		  
		  session.close();
		  
		  System.out.println("Successfully saved");
		  
		  
		  
	
	}

}
