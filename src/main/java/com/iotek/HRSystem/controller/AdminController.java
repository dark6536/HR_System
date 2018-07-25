package com.iotek.HRSystem.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.iotek.HRSystem.domain.Checking;
import com.iotek.HRSystem.domain.Department;
import com.iotek.HRSystem.domain.Employee;
import com.iotek.HRSystem.domain.Position;
import com.iotek.HRSystem.domain.Recruitment;
import com.iotek.HRSystem.domain.RewardAndPunishment;
import com.iotek.HRSystem.domain.Train;
import com.iotek.HRSystem.service.CheckingService;
import com.iotek.HRSystem.service.DepartmentService;
import com.iotek.HRSystem.service.EmployeeService;
import com.iotek.HRSystem.service.PositionService;
import com.iotek.HRSystem.service.RecruitmentService;
import com.iotek.HRSystem.service.RewardAndPunishmentService;
import com.iotek.HRSystem.service.TrainService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private TrainService trainService;
	@Autowired
	private RecruitmentService recruitmentService;
	@Autowired
	private RewardAndPunishmentService rewardAndPunishmenService;
	@Autowired
	private CheckingService checkingService;
	
	
	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminLogin";
	}
	
	@RequestMapping("/loginAdmin")
	public String adminInput(String name,String password) {
		if(name.equals("admin") && password.equals("123")) {
			return "adminMenu";
		}
		return null;
	}
	
	@RequestMapping("/insertDepartment")
	public String insertDepartment() {
		return "addDepartment";
	}

	
	@RequestMapping("/addDepartmentInput")
	public String adminAddDepartment(String name,String job_number,String manager_name) {
		Department department = new Department();
		department.setName(name);
		department.setCreateTime(new Date(System.currentTimeMillis()));
		department.setJob_number(Long.parseLong(job_number));
		department.setManager_name(manager_name);
		departmentService.insertDepartment(department);
		return "adminMenu";
	}
	
	@RequestMapping("/insertPosition")
	public String insertPosition(HttpSession session) {
		List<Department> departments = departmentService.queryAllDepartments();
		session.setAttribute("departments", departments);
		return "addPosition";
	}
	@RequestMapping("/addPositionInput")
	public String addPositionInput(String department,String name,String power) {
		Position position = new Position();
		Department d = new Department();
		d.setId(Integer.parseInt(department));
		position.setName(name);
		position.setDepartment(d);
		position.setPowerType(Integer.parseInt(power));
		position.setCreateTime(new Date(System.currentTimeMillis()));
		System.out.println(position);
		positionService.insertPosition(position);
		return "adminMenu";
	}

	@RequestMapping("/insertRecruitment")
	public String insertRecruitment(HttpSession session) {
		List<Department> departments = departmentService.queryAllDepartments();
		session.setAttribute("departments", departments);
		return "addRecruitment";
	}
	
	@RequestMapping("/insertEmployee")
	public String insertEmployee() {
		return "addEmployee";
	}
	@RequestMapping("/insertTrain")
	public String insertTrain() {
		return "addTrain";
	}
	@RequestMapping("/insertRewardAndPunishment")
	public String insertRewardAndPunishment() {
		return "addRewardAndPunishment";
	}
	@RequestMapping("/queryDepartment")
	public String queryDepartment(HttpSession session) {
		List<Department> departments = departmentService.queryAllDepartmentsExceptDimission();
		session.setAttribute("departments", departments);
		return "queryDepartment";
	}
	
	@RequestMapping("/queryPosition")
	public String queryPosition(HttpSession session){
		List<Position> positions = positionService.queryAllPositions();
		session.setAttribute("positions", positions);
		return "queryPosition";
	}
	
	@RequestMapping("/queryEmployee")
	public String queryEmployee(HttpSession session){
		List<Employee> employees = employeeService.queryAllEmployees();
		session.setAttribute("employees", employees);
		return "queryEmployee";
	}
	@RequestMapping("/queryTrain")
	public String queryTrain(HttpSession session){
		List<Train> trains = trainService.quaryAllTrains();
		session.setAttribute("trains", trains);
		return "queryTrain";
	}
	
	@RequestMapping("/queryRecruitment")
	public String queryRecruitment(HttpSession session){
		List<Recruitment> recruitments = recruitmentService.queryAllRecruitments();
		session.setAttribute("recruitments", recruitments);
		return "queryRecruitment";
	}
	
	@RequestMapping("/queryRewardAndPunishment")
	public String queryRewardAndPunishment(HttpSession session) {
		List<RewardAndPunishment> rewardsAndPunishments = rewardAndPunishmenService.queryAllRewardsAndPunishments();
		session.setAttribute("rewardsAndPunishments", rewardsAndPunishments);
		return "queryRewardAndPunishment";
	}
	
	@RequestMapping("/queryChecking")
	public String queryChecking_in(HttpSession session) {
		List<Checking> checkings = checkingService.queryAllCheckings();
		session.setAttribute("checkings", checkings);
		return "queryChecking";
	}
	
	@RequestMapping("deleteDepartment")
	public String deleteDepartment(Integer id) {
		departmentService.deleteDepartmentById(id);
		return "queryDepartment";
	}
	@RequestMapping("updateDepartment")
	public String updateDepartment(Integer id,HttpSession session) {
		Department department = departmentService.quearyDepartmentById(id);
		session.setAttribute("department", department);
		return "updateDepartment";
	}
	@RequestMapping("updateDepartmentInput")
	public String updateDepartmentInput(Department department) {
		departmentService.updateDepartment(department);
		return "queryDepartment";
	}
	
	@RequestMapping("deleteTrain")
	public String deleteTrain(Integer id) {
		trainService.deleteTrain(id);
		return "queryTrain";
	}
	@RequestMapping("updateTrain")
	public String updateTrain(Integer id,HttpSession session) {
		Train train = trainService.queryTrainById(id);
		session.setAttribute("train", train);
		return "updateTrain";
	}
	@RequestMapping("updateTrainInput")
	public String updateTrainInput(Train train) {
		trainService.updateTrain(train);
		return "queryTrain";
	}
	
	@RequestMapping("deletePosition")
	public String deletePosition(Integer id) {
		positionService.deletePosition(id);
		return "queryPosition";
	}
	@RequestMapping("updatePosition")
	public String updatePosition(Integer id,HttpSession session) {
		Position position = positionService.queryPositionById(id);
		session.setAttribute("position", position);
		List<Department> departments = departmentService.queryAllDepartments();
		session.setAttribute("departments", departments);
		return "updatePosition";
	}
	@RequestMapping("updatePositionInput")
	public String updatePositionInput(Position position) {
		positionService.updatePosition(position);
		return "queryPosition";
	}
}
