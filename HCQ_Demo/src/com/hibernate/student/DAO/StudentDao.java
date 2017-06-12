package com.hibernate.student.DAO;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.student.DTO.StudentDto;

public class StudentDao 
{
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	public void addStudent(StudentDto studentDto)
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(studentDto);
		t.commit();
		System.out.println("Student added");
		session.close();
	}
	
	public void countStudent()
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(StudentDto.class);
		criteria.setProjection(Projections.rowCount());
		
		List rowcount=criteria.list();
		
		System.out.println("Total Number of Student(s) are : "+rowcount.get(0));
		
		t.commit();
		session.close();
	}
	
	public void getStudentMoreThan70Per()
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(StudentDto.class);
		criteria.add(Restrictions.gt("percentage", 70.00));
		criteria.addOrder(Order.desc("percentage"));
		List student=criteria.list();
		
		 for (Iterator iterator = student.iterator(); iterator.hasNext();)
		 {
			 StudentDto studentDto = (StudentDto) iterator.next(); 
			 System.out.println(studentDto.getS_id()+"\t\t"+studentDto.getS_name()+"\t\t"+studentDto.getPercentage()); 
   
		 }
		 t.commit();
		 session.close();
	}
}
