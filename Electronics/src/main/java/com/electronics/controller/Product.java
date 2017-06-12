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
import com.electronics.DTO.ProductDetailsDto;
import com.electronics.DTO.ProductDto;

/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//PrintWriter printWriter=response.getWriter();
		
		String pname=request.getParameter("productname");
		String cname=request.getParameter("companyname");
		double price=Double.parseDouble(request.getParameter("price"));
		
		ElectronicsDao electronicsDao=new ElectronicsDao();
		int flag=0;
		List plist=electronicsDao.showProduct();
		Iterator itr=plist.iterator();
		while(itr.hasNext())
		{
			ProductDto productdto=(ProductDto) itr.next();
			
			if(productdto.getPname().equalsIgnoreCase(pname))
			{
				ProductDetailsDto productDetailsDto=new ProductDetailsDto();
				productDetailsDto.setName(cname);
				productDetailsDto.setPrice(price);
				productDetailsDto.setProduct(productdto);
				
				electronicsDao.addProduct(productDetailsDto);
				flag=1;
				response.sendRedirect("index.jsp");
			}
		}
		
		if(flag==0)
		{
			ProductDto productDto=new ProductDto();
			productDto.setPname(pname);
		
			ProductDetailsDto productDetailsDto=new ProductDetailsDto();
			productDetailsDto.setName(cname);
			productDetailsDto.setPrice(price);
			productDetailsDto.setProduct(productDto);
		
		
			electronicsDao.addProduct(productDetailsDto);
			response.sendRedirect("index.jsp");
		}
	}

}
