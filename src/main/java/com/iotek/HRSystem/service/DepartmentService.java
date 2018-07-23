package com.iotek.HRSystem.service;

import java.util.List;

import com.iotek.HRSystem.domain.Department;

public interface DepartmentService {
	public void insertDepartment(Department department);
	public void deleteDepartment(Integer id);
	public void updateDepartment(Department department);
	public List<Department> queryAllDepartements();
}
