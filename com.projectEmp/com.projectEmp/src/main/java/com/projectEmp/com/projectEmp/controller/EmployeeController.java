package com.projectEmp.com.projectEmp.controller;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
//import org.hibernate.mapping.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectEmp.com.projectEmp.model.EmpData;
import com.projectEmp.com.projectEmp.model.EmployInfo;
import com.projectEmp.com.projectEmp.repo.EmpDatable;
import com.projectEmp.com.projectEmp.service.EmployeService;
import com.projectEmp.com.projectEmp.utility.EmailDao;

@RestController

@RequestMapping("/emp")
//@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	EmployeService empService;

	@Autowired
	EmpDatable empRepo;

	@Autowired
	EmailDao emailDao;

	LocalDateTime ldt;

	// Time time;

	@PostMapping("/addEmployee")
	public void addEmploye(@RequestBody EmployInfo emp) {
		empService.addEmployee(emp);

	}

	// @GetMapping("/search")
	public List<EmpData> searchData() {
		return empRepo.findAll();

	}

	// @Scheduled(fixedRate=10000)
	@Scheduled(cron = "0 16 17 * * *")//24 hrs format
	@GetMapping("/check")
	public void isCheck()
	{
		LocalDate currentDate = LocalDate.now(); // for current date
		System.out.println("Current Date: " + currentDate + " ");

		// System.out.println(java.time.LocalDateTime.now());

		//System.out.println(emailDao.templateSimpleMsg());
		System.out.println(ldt.now());

		// fetching data by dob
		try {
			empService.isCheckDOB();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		

		System.out.println("*******************");
		System.out.println();
		
		// fetching data by dob
		empService.checkDoj();

		
	}

//	@GetMapping("/search")
//	public void isCheckDOB() {
//		LocalDate currentDate = LocalDate.now(); // for current date
//		System.out.println("Current Date: " + currentDate);
//		List<EmpData> d = empService.isCheckDOB();
//		Iterator itr = d.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//	        d.forEach(e->
//	        {
//	        	System.out.println(e.getDob());
//	        	
//	        });

//	}
//	
//	@GetMapping("/serachByDoj")
//	public void checkDoj()
//	{
//		List<EmpData>list=empService.checkDoj();
//		
//		Iterator itr=list.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//	}
//
	@PostMapping("/addEmpData")
	public void AddEmpData(@RequestBody EmpData empData) {
		empService.addEmpData(empData);

		System.out.println(empData);

	}

}
