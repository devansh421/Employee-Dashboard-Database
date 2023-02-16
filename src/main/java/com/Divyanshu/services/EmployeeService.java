package com.Divyanshu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Divyanshu.models.Employee;
import com.Divyanshu.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository repo;

	public List<Employee> getList() 
	{
		return repo.getEmployeeList();
	}
	public void saveRecord(Employee employee) 
	{
		repo.saveEmployeeRecord(employee);
	}
	public void deleteRecord(int eid) 
	{
		Employee emp=repo.getRecord(eid);
		repo.deleteRecord(emp);
	}
	public Employee getRecord(int eid) 
	{
		return repo.getRecord(eid);
	}
	public void updateRecord(Employee nemp) 
	{
		Employee oemp=repo.getRecord(nemp.getEid());
		repo.updateRecord(oemp,nemp);
	}
}
