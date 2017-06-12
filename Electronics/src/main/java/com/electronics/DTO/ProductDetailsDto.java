package com.electronics.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Product_Details")
public class ProductDetailsDto implements Serializable
{
	@Id
	@GenericGenerator(name="any1" ,strategy="increment")
	@GeneratedValue(generator="any1")
	private int id;
	
	@Column(name="company_name")
	private String name;
	private double price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="product_id")
	private ProductDto product;
	
	public ProductDetailsDto(){
		
	}
	
	public ProductDto getProduct() {
		return product;
	}

	public void setProduct(ProductDto product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
