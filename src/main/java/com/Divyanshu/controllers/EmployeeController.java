package com.Divyanshu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Divyanshu.models.Employee;
import com.Divyanshu.services.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public String getDashboardView(Model model)
	{
		List<Employee> list=service.getList();		
		model.addAttribute("elist",list);
		return "employee-list.jsp";
	}
	@RequestMapping("add")
	public String getAddEmployeeView()
	{
		return "insert.jsp";
	}
	@RequestMapping("save")
	public String saveEmployeeRecord(Employee employee)
	{
		service.saveRecord(employee);
		return "redirect:/";
	}
	@RequestMapping("delete")
	public String deleteEmployeeRecord(int eid)
	{
		service.deleteRecord(eid);
		return "redirect:/";
	}
	@RequestMapping("edit")
	public String getEditEmployeeView(int eid,Model model)
	{
		Employee employee=service.getRecord(eid);
		model.addAttribute("emp",employee);
		return "edit.jsp";
	}
	@RequestMapping("update")
	public String updateEmployeeRecord(Employee employee)
	{
		service.updateRecord(employee);
		return "redirect:/";
	}
}
