package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Train {
	private int id;
	private String name;
	private String teacher;
	private Date time;
	private String status;
	public Train() {
		super();
	}
	public Train(int id, String name, String teacher, Date time, String status) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.time = time;
		this.status = status;
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
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", teacher=" + teacher + ", time=" + time + ", status=" + status
				+ "]";
	}
	
	
}
