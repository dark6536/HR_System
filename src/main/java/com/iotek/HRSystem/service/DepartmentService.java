package com.iotek.HRSystem.service;

import java.util.List;

import com.iotek.HRSystem.domain.Department;

public interface DepartmentService {
	public void insertDepartment(Department department);
	public void deleteDepartmentById(Integer id);
	public void updateDepartment(Department department);
	public List<Department> queryAllDepartments();
	public List<Department> queryAllDepartmentsExceptDimission();
	public Department quearyDepartmentById(Integer id);
}
