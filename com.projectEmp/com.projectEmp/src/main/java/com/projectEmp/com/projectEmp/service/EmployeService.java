package com.projectEmp.com.projectEmp.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.projectEmp.com.projectEmp.model.CcEmailId;
import com.projectEmp.com.projectEmp.model.EmpData;
import com.projectEmp.com.projectEmp.model.EmployInfo;
import com.projectEmp.com.projectEmp.repo.CcEmailIdble;
import com.projectEmp.com.projectEmp.repo.EmpDatable;
import com.projectEmp.com.projectEmp.repo.Employ_infoable;
import com.projectEmp.com.projectEmp.utility.EmailDao;

@Service
public class EmployeService {
	
	@Autowired
	Employ_infoable empRepo;
	
	@Autowired
	EmpDatable empDataRepo;
	
	@Autowired
	CcEmailIdble CcEmailRepo;
	
	@Autowired
	EmailDao emailDao;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private JavaMailSenderImpl jmsImpl;

	
	public void addEmployee(EmployInfo emp)
	{
		empRepo.save(emp);
		
	}
	
	public void addEmpData(EmpData empData)
	{
		empDataRepo.save(empData);
	}

	public  void isCheckDOB()
	{
		
		
		//return empDataRepo.findUsersBydob();
		//List<EmpData> d = empDataRepo.findUsersBydob();
		
		//List<CcEmailId> ccList=CcEmailRepo.getCcId();
		
		List<String> ccList = CcEmailRepo.getCcEmail();
		
		
		
		
	//	CcEmailId ccId=new CcEmailId();
		
//		Iterator<String> str=ccList.iterator();
//		
//		while(str.hasNext())
//		{
//			String email=str.next();
//			
//			ccId.add(email);
//		}	
		System.out.println(ccList);
		emailDao.sendMsg(jmsImpl, "gvishwajeet487@gmail.com", "Hii guys", "This is my 1st email", ccList);
//		Iterator itr = d.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//
//		}
		
	}
	
	public void checkDoj()
	{
		//return empDataRepo.findUsersByDoj();
		List<EmpData> list = empDataRepo.findUsersByDoj();
		
		

		Iterator itr1 = list.iterator();

		while (itr1.hasNext()) {
			
			
			System.out.println(itr1.next());

		}

		
		 
	}
	
	

}
