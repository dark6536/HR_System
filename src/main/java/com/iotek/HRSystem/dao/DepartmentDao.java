package com.iotek.HRSystem.dao;

import java.util.List;

import com.iotek.HRSystem.domain.Department;

public interface DepartmentDao {
	public void insertDepartment(Department department);
	public void deleteDepartment(Integer id);
	public void updateDepartment(Department department);
	public List<Department> queryAllDepartments();
	public List<Department> queryAllDepartmentsExceptDimission();
	public Department queryDepartmentById(Integer id);
	
}
