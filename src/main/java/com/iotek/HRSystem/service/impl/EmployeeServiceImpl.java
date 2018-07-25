package com.iotek.HRSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.EmployeeDao;
import com.iotek.HRSystem.domain.Employee;
import com.iotek.HRSystem.service.EmployeeService;
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> queryAllEmployees() {
		return employeeDao.queryAllEmployees();
	}
	
}
