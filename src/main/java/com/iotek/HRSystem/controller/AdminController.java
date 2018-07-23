package com.iotek.HRSystem.controller;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.HRSystem.domain.Department;
import com.iotek.HRSystem.service.DepartmentService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminLogin";
	}
	
	@RequestMapping("/loginAdmin")
	public String adminInput(String name,String password) {
		if(name.equals("admin") && password.equals("123")) {
			return "adminMenu";
		}
		return null;
	}
	
	@RequestMapping("/insertDepartment")
	public String insertDepartment() {
		return "addDepartment";
	}
	@RequestMapping("/insertRecruitment")
	public String insertRecruitment() {
		return "addRecruitment";
	}
	@RequestMapping("/adminAddDepartment")
	public String adminAddDepartment(String departmentName) {
		System.out.println(departmentName);
		Department department = new Department();
		department.setName(departmentName);
		department.setCreateTime(new Date(System.currentTimeMillis()));
		departmentService.insertDepartment(department);
		return "adminMenu";
	}
	@RequestMapping("/deleteDepartment")
	public String deletePartment(int id) {
		return "adminMenu";
	}
	
	@RequestMapping("/updateDepartment")
	public String updatePartment(Department department) {
		departmentService.updateDepartment(department);
		return "adminMenu";
	}
}
