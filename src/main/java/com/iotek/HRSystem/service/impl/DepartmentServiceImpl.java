package com.iotek.HRSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.DepartmentDao;
import com.iotek.HRSystem.domain.Department;
import com.iotek.HRSystem.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public void insertDepartment(Department department) {
		departmentDao.insertDepartment(department);
	}

	@Override
	public void deleteDepartmentById(Integer id) {
		departmentDao.deleteDepartment(id);
	}

	@Override
	public void updateDepartment(Department department) {
		departmentDao.updateDepartment(department);
	}

	@Override
	public List<Department> queryAllDepartments() {
		return departmentDao.queryAllDepartments();
	}

	@Override
	public List<Department> queryAllDepartmentsExceptDimission() {
		return departmentDao.queryAllDepartmentsExceptDimission();
	}

	@Override
	public Department quearyDepartmentById(Integer id) {
		return departmentDao.queryDepartmentById(id);
	}
	
	
}
