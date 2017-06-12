package com.electronics.DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Product")
public class ProductDto implements Serializable
{
	@Id
	@GenericGenerator(name="any" , strategy="increment")
	@GeneratedValue(generator="any")
	@Column(name="product_id")
	
	private int id;
	@Column(name="product_name")
	private String pname;
	
	public ProductDto()
	{
		
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	
	
}
