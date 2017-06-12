package com.hibernate.student.Util;

import java.util.Scanner;

import com.hibernate.student.DAO.StudentDao;
import com.hibernate.student.DTO.StudentDto;

public class Tester 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		StudentDao studentDao=new StudentDao();
		while(true)
		{
			System.out.println("......MENU.......");
			System.out.println("1.Add Student\n2.Total Students\n3.Student(s) having more marks than 70\n4.Exit");
			
			System.out.println("Enter your choice");
			int ch=scanner.nextInt();
			
			switch(ch)
			{
				case 1:
					
						System.out.println("Enter Student Name: ");
						String sname=scanner.next();
						
						System.out.println("Enter Student's Marks: ");
						
						double marks=scanner.nextDouble();
						
						StudentDto studentDto=new StudentDto();	
						studentDto.setS_name(sname);
						studentDto.setPercentage(marks);
		
						studentDao.addStudent(studentDto);
						break;
				case 2:
						studentDao.countStudent();
						break;
				case 3:
						System.out.println("Student_ID\tStudent Name\tPercentage");
						studentDao.getStudentMoreThan70Per();
						break;
				case 4:System.exit(0);	
			}
		}
	}

}
