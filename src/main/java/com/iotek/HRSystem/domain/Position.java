package com.iotek.HRSystem.domain;

public class Position {
	private int id;
	private String name;
	private Department department;
	public Position() {
		super();
	}
	
	public Position(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
