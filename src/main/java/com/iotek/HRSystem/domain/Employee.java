package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Employee {
	private int id;
	private String name;
	private long job_number;
	private Visitor vistor;
	private Position position;
	private Date entry_time;//签订合同时间
	private Date expiry_time;//合同到期时间
	private String status;//在职/离职/实习
	public Employee() {
		super();
	}
	public Employee(int id, String name, long job_number, Visitor vistor, Position position, Date entry_time,
			Date expiry_time, String status) {
		super();
		this.id = id;
		this.name = name;
		this.job_number = job_number;
		this.vistor = vistor;
		this.position = position;
		this.entry_time = entry_time;
		this.expiry_time = expiry_time;
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
	public long getJob_number() {
		return job_number;
	}
	public void setJob_number(long job_number) {
		this.job_number = job_number;
	}
	public Visitor getVistor() {
		return vistor;
	}
	public void setVistor(Visitor vistor) {
		this.vistor = vistor;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public Date getExpiry_time() {
		return expiry_time;
	}
	public void setExpiry_time(Date expiry_time) {
		this.expiry_time = expiry_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job_number=" + job_number + ", vistor=" + vistor
				+ ", position=" + position + ", entry_time=" + entry_time + ", expiry_time=" + expiry_time + ", status="
				+ status + "]";
	}
	
	
	
}
