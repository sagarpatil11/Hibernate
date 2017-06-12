package com.hibernate.mobile.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hibernate.mobile.DTO.MobileDto;

public class MobileDao 
{

	Configuration cfg=new AnnotationConfiguration().configure();

	SessionFactory factory=cfg.buildSessionFactory();
	public void add_data(MobileDto mobiledto)
	{
			
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		session.save(mobiledto);
		t.commit();
		session.close();
	}
	
	public void display()
	{
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		List mlist=session.createQuery("FROM MobileDto").list();
		
		for(Iterator iterator=mlist.iterator(); iterator.hasNext();)
		{
			MobileDto mobileDto=(MobileDto) iterator.next();
			System.out.println("ID: "+mobileDto.getId());
			System.out.println("Company Name: "+mobileDto.getComp_name());
			System.out.println("Model: "+mobileDto.getModel_no());
			System.out.println("Price: "+mobileDto.getPrice());
		}
		t.commit();
		session.close();
	}
	
	public void displayCompanyName()
	{	
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		List mlist=session.createQuery("SELECT M.comp_name FROM MobileDto M").list();
		Iterator iterator=mlist.iterator();
	
		while( iterator.hasNext())
		{
		//	MobileDto mobileDto=(MobileDto) iterator.next();
			//System.out.println("ID: "+mobileDto.getId());
			System.out.println(iterator.next());
			//System.out.println("Model: "+mobileDto.getModel_no());
			//System.out.println("Price: "+mobileDto.getPrice());
		}
		
		//System.out.println(mlist);
		
	}
}
