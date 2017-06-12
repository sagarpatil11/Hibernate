package com.onetoone.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Address")
public class AddressDto implements Serializable
{
	@Id
	@GeneratedValue
//	@Column(name="add_id")
	private int id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String State;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeeDto employee;
	
	public AddressDto(){
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	
	public void setState(String state) {
		State = state;
	}

	public EmployeeDto getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}

	
	
}
