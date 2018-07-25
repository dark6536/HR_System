package com.iotek.HRSystem.domain;

import java.sql.Date;

public class RewardAndPunishment {
	private int id;
	private long job_number;
	private String type;
	private String detail;
	private double measure;
	private Date time;
	public RewardAndPunishment() {
		super();
	}
	public RewardAndPunishment(int id, long job_number, String type, String detail, double measure, Date time) {
		super();
		this.id = id;
		this.job_number = job_number;
		this.type = type;
		this.detail = detail;
		this.measure = measure;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getJob_number() {
		return job_number;
	}
	public void setJob_number(long job_number) {
		this.job_number = job_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getMeasure() {
		return measure;
	}
	public void setMeasure(double measure) {
		this.measure = measure;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "RewardAndPunishment [id=" + id + ", job_number=" + job_number + ", type=" + type + ", detail=" + detail
				+ ", measure=" + measure + ", time=" + time + "]";
	}
	
	
}
