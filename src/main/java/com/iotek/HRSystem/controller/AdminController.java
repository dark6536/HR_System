package com.iotek.HRSystem.controller;


import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.iotek.HRSystem.domain.Department;
import com.iotek.HRSystem.domain.Position;
import com.iotek.HRSystem.service.DepartmentService;
import com.iotek.HRSystem.service.PositionService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
	
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

	
	@RequestMapping("/addDepartmentInput")
	public String adminAddDepartment(String name,String job_number,String manager_name) {
		Department department = new Department();
		department.setName(name);
		department.setCreateTime(new Date(System.currentTimeMillis()));
		department.setJob_number(Long.parseLong(job_number));
		department.setManager_name(manager_name);
		departmentService.insertDepartment(department);
		return "adminMenu";
	}
	
	@RequestMapping("/insertPosition")
	public String insertPosition() {
		return "addPosition";
	}
	@RequestMapping("/addPositionInput")
	public String addPositionInput(String department,String name,String power) {
		Position position = new Position();
		Department d = new Department();
		d.setId(Integer.parseInt(department));
		position.setName(name);
		position.setDepartment(d);
		position.setPowerType(Integer.parseInt(power));
		position.setCreateTime(new Date(System.currentTimeMillis()));
		System.out.println(position);
		positionService.insertPosition(position);
		return "adminMenu";
	}

	@RequestMapping("/insertRecruitment")
	public String insertRecruitment(HttpSession session) {
		List<Department> departments = departmentService.queryAllDepartments();
		session.setAttribute("departments", departments);
		return "addRecruitment";
	}
	@RequestMapping("/departmentList")
	public void departmentList(HttpServletResponse response) throws IOException {
		List<Department> departments = departmentService.queryAllDepartments();
		String jsonString = JSON.toJSONString(departments);
		response.getWriter().print(jsonString);
	}
	@RequestMapping("/insertEmployee")
	public String insertEmployee() {
		return "addEmployee";
	}
	@RequestMapping("/insertTrain")
	public String insertTrain() {
		return "addTrain";
	}
	@RequestMapping("/insertRewardAndPunishment")
	public String insertRewardAndPunishment() {
		return "addRewardAndPunishment";
	}
	@RequestMapping("/queryDepartment")
	public String queryDepartment(HttpSession session) {
		List<Department> departments = departmentService.queryAllDepartmentsExceptDimission();
		session.setAttribute("departments", departments);
		return "queryDepartment";
	}
	
	
	
}
