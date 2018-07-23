package com.iotek.HRSystem.dao;

import com.iotek.HRSystem.domain.Visitor;

public interface VisitorDao {
	public void insertVisitor(Visitor visitor);
	public Visitor queryVisitorByNameAndPassword(String name,String password);
	public Visitor queryVisitorByPhone(long phone);
	public void updateVisitorByPhone(Visitor visitor);
}
