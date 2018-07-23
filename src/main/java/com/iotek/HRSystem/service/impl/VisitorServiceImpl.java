package com.iotek.HRSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.HRSystem.dao.VisitorDao;
import com.iotek.HRSystem.domain.Visitor;
import com.iotek.HRSystem.service.VisitorService;
@Service("visitorService")
public class VisitorServiceImpl implements VisitorService{
	@Autowired
	private VisitorDao visitorDao;
	
	@Override
	public void insertVisitor(Visitor visitor) {
		visitorDao.insertVisitor(visitor);
	}

	@Override
	public Visitor queryVisitorByNameAndPassword(String name, String password) {
		return visitorDao.queryVisitorByNameAndPassword(name, password);
	}

	@Override
	public Visitor queryVisitorByPhone(long phone) {
		return visitorDao.queryVisitorByPhone(phone);
	}

	@Override
	public void updateVisitorByPhone(Visitor visitor) {
		visitorDao.updateVisitorByPhone(visitor);
	}

}
