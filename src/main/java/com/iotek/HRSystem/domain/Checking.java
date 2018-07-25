package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Checking {
	private int id;
	private Employee employee;
	private Date realClock_in;
	private Date shouleClock_in;
	private Date realClock_out;
	private Date shouleClock_out;
	private String status;
	public Checking() {
		super();
	}
	public Checking(int id, Employee employee, Date realClock_in, Date shouleClock_in, Date realClock_out,
			Date shouleClock_out, String status) {
		super();
		this.id = id;
		this.employee = employee;
		this.realClock_in = realClock_in;
		this.shouleClock_in = shouleClock_in;
		this.realClock_out = realClock_out;
		this.shouleClock_out = shouleClock_out;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getRealClock_in() {
		return realClock_in;
	}
	public void setRealClock_in(Date realClock_in) {
		this.realClock_in = realClock_in;
	}
	public Date getShouleClock_in() {
		return shouleClock_in;
	}
	public void setShouleClock_in(Date shouleClock_in) {
		this.shouleClock_in = shouleClock_in;
	}
	public Date getRealClock_out() {
		return realClock_out;
	}
	public void setRealClock_out(Date realClock_out) {
		this.realClock_out = realClock_out;
	}
	public Date getShouleClock_out() {
		return shouleClock_out;
	}
	public void setShouleClock_out(Date shouleClock_out) {
		this.shouleClock_out = shouleClock_out;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Checking [id=" + id + ", employee=" + employee + ", realClock_in=" + realClock_in
				+ ", shouleClock_in=" + shouleClock_in + ", realClock_out=" + realClock_out + ", shouleClock_out="
				+ shouleClock_out + ", status=" + status + "]";
	}
	
	
}
