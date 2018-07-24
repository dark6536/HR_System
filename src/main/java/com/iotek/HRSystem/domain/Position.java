package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Position {
	private int id;
	private String name;
	private Department department;
	private int powerType;
	private Date createTime;
	
	
	public Position() {
		super();
	}


	

	public Position(int id, String name, Department department, int powerType, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.powerType = powerType;
		this.createTime = createTime;
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


	public int getPowerType() {
		return powerType;
	}


	public void setPowerType(int powerType) {
		this.powerType = powerType;
	}




	public Date getCreateTime() {
		return createTime;
	}




	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}




	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", department=" + department + ", powerType=" + powerType
				+ ", createTime=" + createTime + "]";
	}


	
	
	
	
}
