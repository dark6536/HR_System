package com.iotek.HRSystem.service;

import com.iotek.HRSystem.domain.Visitor;

public interface VisitorService {
	public void insertVisitor(Visitor visitor);
	public Visitor queryVisitorByNameAndPassword(String name,String password);
	public Visitor queryVisitorByPhone(long phone);
	public void updateVisitorByPhone(Visitor visitor);
}
