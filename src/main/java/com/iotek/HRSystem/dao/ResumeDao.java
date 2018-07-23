package com.iotek.HRSystem.dao;

import com.iotek.HRSystem.domain.Resume;

public interface ResumeDao {
	public void insertResume(Resume resume);
	public void deleteResume(Integer id);
}
