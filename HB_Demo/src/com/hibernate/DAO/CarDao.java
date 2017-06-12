package com.hibernate.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.DTO.CarDto;
import com.hibernatesession.HibernateSessionFactory;

public class CarDao 
{
	SessionFactory sessionfactory=HibernateSessionFactory.getSessionFactory(); //from seesionfactory.jar file
	
	public void addCar(CarDto carDto)
	{
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(carDto);
		t.commit();
		session.close();
	}
}
