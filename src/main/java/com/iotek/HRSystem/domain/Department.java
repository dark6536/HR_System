package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Department {
	private int id;
	private String name;
	private Date createTime;
	private long job_number;
	private String manager_name;

	public Department() {
		super();
	}
	public Department(int id, String name, Date createTime, long job_number, String manager_name) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
		this.job_number = job_number;
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

	public long getJob_number() {
		return job_number;
	}

	public void setJob_number(long job_number) {
		this.job_number = job_number;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", createTime=" + createTime + ", job_number=" + job_number
				+ ", manager_name=" + manager_name + "]";
	}

	
}
