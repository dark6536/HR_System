package com.iotek.HRSystem.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.HRSystem.domain.Resume;
import com.iotek.HRSystem.domain.Visitor;
import com.iotek.HRSystem.service.ResumeService;
import com.iotek.HRSystem.service.VisitorService;
import com.iotek.HRSystem.util.MD5Util;

@Controller
@RequestMapping("/visitor")
public class VisitorController {
	@Autowired
	private VisitorService visitorService;
	@Autowired
	private ResumeService resumeService;
	
	@RequestMapping("visitorLogin")
	public String visitorLogin() {
		return "visitorLogin";
	}

	
	@RequestMapping("loginVisitor")
	public String loginVisitor(String name,String password,HttpSession session) {
		Visitor visitor = new Visitor();
		visitor.setName(name);
		visitor.setPassword(password);
		session.setAttribute("visitor", visitor);
		return "visitorMenu";
	}
	
	@RequestMapping("registVisitor")
	public String insertVisitor() {
		return "insertVisitor";
	}
	
	
	@RequestMapping("visitorInput")
	public String visitorInput(String name,String password,long phone,HttpSession session) {
		Visitor visitor = new Visitor();
		visitor.setName(name);
		visitor.setPassword(password);
		visitor.setPhone(phone);
		visitor.setCreateTime(new Date(System.currentTimeMillis()));		
		visitorService.insertVisitor(visitor);
		session.setAttribute("visitor", visitor);
		return "visitorMenu";
	}
	
	@RequestMapping("updateVisitorByPhone")
	public String updateVisitorByPhone(long phone,HttpSession session) {
		Visitor visitor = new Visitor();
		visitor.setPhone(phone);
		session.setAttribute("visitor", visitorService.queryVisitorByPhone(phone));
		return "updateVisitorInput";
	}
	
	@RequestMapping("updateVisitorInput")
	public String updateVisitorInput(Integer id,String name,String password,HttpSession session) {
		Visitor visitor = new Visitor();
		visitor.setName(name);
		visitor.setPassword(password);
		visitor.setId(id);
		visitorService.updateVisitorByPhone(visitor);
		session.setAttribute("visitor", visitor);
		return "visitorMenu";
	}
	@RequestMapping("resumeInput")
	public String resumeInput(Resume resume) {
		resumeService.insertResume(resume);
		return "index";
	}
	@RequestMapping("myresume")
	public String myresumet() {
		return "resumeInput";
	}
}
