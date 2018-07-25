package com.iotek.HRSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.RecruitmentDao;
import com.iotek.HRSystem.domain.Recruitment;
import com.iotek.HRSystem.service.RecruitmentService;
@Service("recruitmentService")
public class RecruitmentServiceImpl implements RecruitmentService{
	@Autowired
	private RecruitmentDao recruitmentDao;
	@Override
	public List<Recruitment> queryAllRecruitments() {
		return recruitmentDao.queryAllRecruitments();
	}

}
