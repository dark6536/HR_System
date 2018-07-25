package com.iotek.HRSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.CheckingDao;
import com.iotek.HRSystem.domain.Checking;
import com.iotek.HRSystem.service.CheckingService;
@Service("checkingService")
public class CheckingServiceImpl implements CheckingService{
	@Autowired
	private CheckingDao checkingDao;

	@Override
	public List<Checking> queryAllCheckings() {
		return checkingDao.queryAllCheckings();
	}
	

}
