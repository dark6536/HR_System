package com.iotek.HRSystem.dao;

import java.util.List;

import com.iotek.HRSystem.domain.Employee;

public interface EmployeeDao {
	public List<Employee> queryAllEmployees();
}
