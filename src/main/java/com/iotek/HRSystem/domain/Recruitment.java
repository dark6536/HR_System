package com.iotek.HRSystem.domain;

public class Recruitment {
	private int id;
	private Position position;
	private String detail;
	private String require;
	private double salary;
	public Recruitment() {
		super();
	}
	public Recruitment(int id, Position position, String detail, String require, double salary) {
		super();
		this.id = id;
		this.position = position;
		this.detail = detail;
		this.require = require;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getRequire() {
		return require;
	}
	public void setRequire(String require) {
		this.require = require;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Recruitment [id=" + id + ", position=" + position + ", detail=" + detail + ", require=" + require
				+ ", salary=" + salary + "]";
	}
	
	
}
