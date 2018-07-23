package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Visitor {
	private int id;
	private String name;
	private String password;
	private long phone;
	private Date createTime;
	private Resume resume;
	public Visitor() {
		super();
	}
	public Visitor(int id, String name, String password, long phone, Date createTime, Resume resume) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.createTime = createTime;
		this.resume = resume;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Visitor [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", createTime="
				+ createTime + ", resume=" + resume + "]";
	}
	
	
	
}
