package com.iotek.HRSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.ResumeDao;
import com.iotek.HRSystem.domain.Resume;
import com.iotek.HRSystem.service.ResumeService;
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService{
	@Autowired
	private ResumeDao resumeDao;
	
	@Override
	public void insertResume(Resume resume) {
		resumeDao.insertResume(resume);
	}

	@Override
	public void deleteResume(Integer id) {
		resumeDao.deleteResume(id);
	}

}
