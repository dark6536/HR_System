package com.iotek.HRSystem.service;

import com.iotek.HRSystem.domain.Resume;

public interface ResumeService {
	public void insertResume(Resume resume);
	public void deleteResume(Integer id);
}
