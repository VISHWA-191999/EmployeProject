package com.projectEmp.com.projectEmp.utility;

import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.projectEmp.com.projectEmp.model.CcEmailId;

import jakarta.mail.internet.InternetAddress;


@Configuration
public class EmailDao {
	
	@Bean
	public SimpleMailMessage templateSimpleMsg()
	{
		SimpleMailMessage msg=new SimpleMailMessage();
		
		msg.setText("Hello Mail");
		 
		 return msg;
		
		
	}
	public HashMap<String, Object> sendMsg(JavaMailSenderImpl emailSender, String email, String emailMsg, String subject, List<String> userGmailList) 
	{
	    HashMap<String, Object> response = new HashMap<>();

	    SimpleMailMessage msg = new SimpleMailMessage();
	    //used to create a simple mail message including the from, to, cc, subject and text fields

	    // Set the email sender, reply-to, subject, and email message
	    msg.setFrom("thinkquotientotp@myexamo.com");
	    msg.setReplyTo("thinkquotientotp@myexamo.com");
	    
	    msg.setSubject(subject);
	    msg.setText(emailMsg);

	    // Add the primary recipient (specified by 'email') to the 'To' list
	    msg.setTo(email);
	    System.out.println(email);
	    
	    String [] newCcEmail = userGmailList.toArray(new String[0]);
	   
	   //String newCcEmail = String.join(",", userGmailList);
	   
	   System.out.println(newCcEmail);
	   
	   msg.setCc(newCcEmail);
	    
	    
//	    if (userGmailList != null) {
//	        for (CcEmailId ccEmailId : userGmailList) {
//	            // Add email addresses from each 'CcEmailId' to the 'To' list
//	            String ccEmails = ccEmailId.getCcEmail();
//	            System.out.println(ccEmails);
//	            emailSender.send(msg);
//	            if (ccEmails != null && !ccEmails.isEmpty()) {
//	                msg.setCc(ccEmails);
//	                
//	               
//	            }
//	        }
//	    }
	    
//	    
	   /* StringBuilder ccEmailsBuilder = new StringBuilder();
	    if (userGmailList != null) {
	    

	    for (CcEmailId ccEmailId : userGmailList) {
	    	
	    	
	        String ccEmails = ccEmailId.getCcEmail();
	        System.out.println(ccEmails);

	        if (ccEmails != null && !ccEmails.isEmpty()) {
	            if (ccEmailsBuilder.length() > 0) {
	                ccEmailsBuilder.append(","); // Add a comma and space if needed
	            }
	            ccEmailsBuilder.append(ccEmails);
	            
	            System.out.println(ccEmails);
	        }
	        System.out.println(ccEmails);
	        
	    }
*/	   // String commaSeparatedEmails = ccEmailsBuilder.toString();
	    //System.out.println(commaSeparatedEmails);
	    
	    //msg.setCc(commaSeparatedEmails);
	    //System.out.println(msg);
	   
	//}
	    
	    
//	    String emails="";
//	    if(userGmailList !=null)
//	    {
//	    	for(CcEmailId ccemailId:userGmailList)
//	    	{
//	    		System.out.println(ccemailId);
//	    		emails= ccemailId.getCcEmail();
//	    		System.out.println(emails);
//	    		
//	    	}
//	    }
//	    


	    // Send the email
	    
	   System.out.println();
	    emailSender.send(msg);

	    // Prepare the response
	    response.put("STATUS", true);
	    response.put("MSG", "Password is sent successfully on your email.");

	    return response;
	}

//	public HashMap<String, Object> sendMsg(JavaMailSenderImpl emailSender, String email, String emailMsg,
//			String subject, List<CcEmailId> userGmail) {
//		HashMap<String, Object> response = new HashMap<>();
//
//		SimpleMailMessage msg;
//
//		msg = new SimpleMailMessage();
//		
//		
//
//		if (userGmail == null || userGmail.getCcEmail().isEmpty()) // Priyanka
//		{
//			msg.setTo(email);
//		} else if (userGmail.equals("")) {
//			msg.setTo(email);    
//		} else {
//			msg.setTo(email);
//			
//			msg.setTo(userGmail.getCcEmail());
//		}
//
//		msg.setFrom("thinkquotientotp@myexamo.com");
//		msg.setReplyTo("thinkquotientotp@myexamo.com");
//		msg.getSentDate();
//		msg.setSubject(subject);
//		msg.setText(emailMsg);
//
//	
//		emailSender.send(msg);
//		response.put("STATUS", true);
//		response.put("MSG", "Password is sent successfully on your email.");
//
//		return response;
//
//	}
//
//	
	
	
//	public HashMap<String, Object> sendMsg(JavaMailSenderImpl emailSender, String email, String emailMsg,
//			String subject, String userGmail) {
//		HashMap<String, Object> response = new HashMap<>();
//
//		SimpleMailMessage msg;
//
//		msg = new SimpleMailMessage();
//
//		if (userGmail == null) // Priyanka
//		{
//			msg.setTo(email);
//		} else if (userGmail.equals("")) {
//			msg.setTo(email);    
//		} else {
//			msg.setTo(email);
//			msg.setCc(userGmail);
//		}
//
//		msg.setFrom("thinkquotientotp@myexamo.com");
//		msg.setReplyTo("thinkquotientotp@myexamo.com");
//		msg.getSentDate();
//		msg.setSubject(subject);
//		msg.setText(emailMsg);
//
//	
//		emailSender.send(msg);
//		response.put("STATUS", true);
//		response.put("MSG", "Password is sent successfully on your email.");
//
//		return response;
//
//	}
//
//	
	

}
