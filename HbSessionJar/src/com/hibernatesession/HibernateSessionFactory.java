package com.hibernatesession;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory 
{
		private static SessionFactory sessionFactory;
		private HibernateSessionFactory(){
	
		}
		
		public static synchronized SessionFactory getSessionFactory()
		{
			try
			{
				sessionFactory=new Configuration().configure().buildSessionFactory();
				
				
			}catch(Exception e){
				System.out.println("SessionFactory creation failed");
				e.printStackTrace();
			}
			return sessionFactory;
			
		}
		
		
}
