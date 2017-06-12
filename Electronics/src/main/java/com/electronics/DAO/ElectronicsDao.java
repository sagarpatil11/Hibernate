package com.electronics.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.electronics.DTO.ProductDetailsDto;

public class ElectronicsDao 
{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	public void addProduct(ProductDetailsDto productDetailsDto)
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(productDetailsDto);
		t.commit();
		session.close();
	}
	
	public List showProduct()
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		List products=session.createQuery("FROM ProductDto").list();
		t.commit();
		session.close();
		return products;
	}
}
