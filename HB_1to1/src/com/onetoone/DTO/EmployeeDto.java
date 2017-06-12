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
@Table(name="Employee")
public class EmployeeDto implements Serializable
{
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private int eid;
	
	@Column(name="emp_name")
	private String ename;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private AddressDto address;
	
	public EmployeeDto(){
		
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public AddressDto getAddress() {
		return address;
	}
	
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	
	
	
	
}
