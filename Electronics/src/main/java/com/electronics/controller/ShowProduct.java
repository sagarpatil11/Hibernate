package com.electronics.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.electronics.DAO.ElectronicsDao;
import com.electronics.DTO.ProductDto;

/**
 * Servlet implementation class ShowProduct
 */
public class ShowProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		
		ElectronicsDao electronicsDao=new ElectronicsDao();
		List productlist=electronicsDao.showProduct();
		Iterator iterator=productlist.iterator();
		printWriter.println("<html><body>");
		printWriter.println("<table><tr><th>Name</th></tr>");
		while(iterator.hasNext())
		{
			ProductDto productDto=(ProductDto) iterator.next();
			printWriter.println("<tr><td><a href='ShowProductDetails'>"+productDto.getPname()+"</a></td></tr>");
		}
		printWriter.println("</table></html></body>");
	}

}
