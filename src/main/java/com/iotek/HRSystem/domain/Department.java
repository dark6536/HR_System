package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Department {
	private int id;
	private String name;
	private Date createTime;
	private int manager_id;
	private String manager_name;

	public Department() {
		super();
	}

	

	public Department(int id, String name, Date createTime, int manager_id, String manager_name) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
		this.manager_id = manager_id;
		this.manager_name = manager_name;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public int getManager_id() {
		return manager_id;
	}



	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}



	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", createTime=" + createTime + ", manager_id=" + manager_id
				+ ", manager_name=" + manager_name + "]";
	}



	

}
