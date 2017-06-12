package com.hibernate.DTO;

import java.io.Serializable;


public class CarDto implements Serializable 
{
	private int c_id;
	private String Cname;
	private String model;
	private int Price;
	
	public CarDto()
	{
		
	}

	
	public int getC_id() {
		return c_id;
	}


	public void setC_id(int c_id) {
		this.c_id = c_id;
	}


	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	
}


