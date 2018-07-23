package com.iotek.HRSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@MapperScan("com.iotek.HRSystem.dao")
public class HrSystemApplication {
	
	@RequestMapping("")
	public String index() {
		return "index";
	}
	@RequestMapping("login")
	public String login() {
		return "loginMenu";
	}
	@RequestMapping("logout")
	public String logout() {
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(HrSystemApplication.class, args);
	}
}
