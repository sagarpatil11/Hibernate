package com.hibernate.mobile.DTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mobile")
public class MobileDto implements Serializable 
{
	@Id
	private int id;
	private String comp_name;
	private String model_no;
	private int price;
	
	public MobileDto() {
		//System.out.println(getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
