package com.iotek.HRSystem.domain;

import java.sql.Date;

public class Resume {
	private int id;
	private Visitor visitor;
	private String name;
	private String gender;
	private int age;
	private Date birthday;
	private String education_background;
	private String graduate_school;
	private String major;
	private Date graduate_time;
	private long phone;
	private String email;
	private String politics_status;
	private String city;
	private String status;
	public Resume() {
		super();
	}
	
	
	public Resume(int id, Visitor visitor, String name, String gender, int age, Date birthday,
			String education_background, String graduate_school, String major, Date graduate_time, long phone,
			String email, String politics_status, String city, String status) {
		super();
		this.id = id;
		this.visitor = visitor;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.birthday = birthday;
		this.education_background = education_background;
		this.graduate_school = graduate_school;
		this.major = major;
		this.graduate_time = graduate_time;
		this.phone = phone;
		this.email = email;
		this.politics_status = politics_status;
		this.city = city;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEducation_background() {
		return education_background;
	}
	public void setEducation_background(String education_background) {
		this.education_background = education_background;
	}
	public String getGraduate_school() {
		return graduate_school;
	}
	public void setGraduate_school(String graduate_school) {
		this.graduate_school = graduate_school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Date getGraduate_time() {
		return graduate_time;
	}
	public void setGraduate_time(Date graduate_time) {
		this.graduate_time = graduate_time;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPolitics_status() {
		return politics_status;
	}
	public void setPolitics_status(String politics_status) {
		this.politics_status = politics_status;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public Visitor getVisitor() {
		return visitor;
	}


	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}


	@Override
	public String toString() {
		return "Resume [id=" + id + ", visitor=" + visitor + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", birthday=" + birthday + ", education_background=" + education_background + ", graduate_school="
				+ graduate_school + ", major=" + major + ", graduate_time=" + graduate_time + ", phone=" + phone
				+ ", email=" + email + ", politics_status=" + politics_status + ", city=" + city + ", status=" + status
				+ "]";
	}


	
	
	
	
}
