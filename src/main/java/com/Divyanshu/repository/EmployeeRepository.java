package com.Divyanshu.repository;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Divyanshu.models.Employee;

@Repository
public class EmployeeRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public EmployeeRepository(SessionFactory factory)
	{
		ses=factory.openSession();
		t=ses.getTransaction();
	}

	public List<Employee> getEmployeeList() 
	{
		Query<Employee> q=ses.createQuery("from Employee");
		return q.list();
	}
	public void saveEmployeeRecord(Employee employee) 
	{
		t.begin();
		ses.save(employee);
		t.commit();
	}
	public Employee getRecord(int eid) 
	{
		Employee emp=ses.get(Employee.class,eid);
		return emp;
	}
	public void deleteRecord(Employee emp)
	{
		t.begin();
		ses.remove(emp);
		t.commit();
	}
	public void updateRecord(Employee oemp, Employee nemp) 
	{
		t.begin();
		oemp.setFirstname(nemp.getFirstname());
		oemp.setLastname(nemp.getLastname());
		oemp.setDepartment(nemp.getDepartment());
		oemp.setPhone(nemp.getPhone());
		oemp.setEmail(nemp.getEmail());
		oemp.setSalary(nemp.getSalary());
		t.commit();
	}
}
