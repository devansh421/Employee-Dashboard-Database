package com.Divyanshu.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(generator = "emp_seq")
	@SequenceGenerator(name = "emp_seq",initialValue = 101,allocationSize = 1)
	private int eid;
	@Column(length = 20)
	private String firstname;
	@Column(length = 20)
	private String lastname;
	@Column(length = 30)
	private String department;
	@Column(length = 15)
	private String phone;
	@Column(length = 100)
	private String email;
	private int salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
