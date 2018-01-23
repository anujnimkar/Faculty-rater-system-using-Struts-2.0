/*--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: LearningAction.java

*Description    : This is the page where faculty and student validity is verified

*Created On     : 15-10-2012  

-----------------------------------------    */ 

package com.company.Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.company.beans.LoginBean;
import com.company.exceptions.LearningException;
import com.company.service.LearningService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven; 

public class LearningAction extends ActionSupport implements ModelDriven<Object>,SessionAware   {

	private LoginBean lb = new LoginBean();
	Map<String,Object> session; 
	
	public Map<String, Object> getSession() {
		return session;
	}

	public LoginBean getLb() {
		return lb;
	}

	public void setLb(LoginBean lb) { 
		this.lb = lb;
	}
	
	
	
	//This function verifies the faculty validity 
	public String isFacultyExists() throws LearningException
	{
		boolean flag = false;
		LearningService ls = new LearningService();
		flag = ls.isFacultyExists(lb);
		
		if(flag == true)
		{
			session.put("facultyid",lb.getUserid());  
			return "success";
		}
		else
		return "error";
		
	}//end method isFacultyExists
	
	
	
	//This function verifies the student validity  
	public String isStudentExists() throws LearningException
	{
		boolean flag = false;
		LearningService ls = new LearningService();
		flag = ls.isStudentExists(lb);
		
		if(flag == true)
		{	
			session.put("studentid",lb.getUserid()); 
			return "success";
		}
		else
		return "error";	
	}//end method isStudentExists
	
	
	
	
	
	

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return lb;
	}

	@Override
	public void setSession(Map<String, Object> session1) {
		this.session = session;   
		
	}
	
	

}
