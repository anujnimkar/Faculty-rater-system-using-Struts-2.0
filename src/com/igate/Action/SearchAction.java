/*--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: SearchAction.java

*Description    : This page has been designed in order to provide the logic for searching a specific program record

*Created On     : 15-10-2012 

-----------------------------------------    */ 

package com.igate.Action;  

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.igate.beans.Feedback;
import com.igate.beans.ProgramBean;
import com.igate.exceptions.LearningException;
import com.igate.service.LearningService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SearchAction extends ActionSupport implements ModelDriven<Object>,SessionAware    {

	private ProgramBean pb = new ProgramBean();
	
	Map<String,Object> session; 
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ProgramBean getPb() {
		return pb;
	}

	public void setPb(ProgramBean pb) {
		this.pb = pb;
	}

	public String searchprogramdetails() throws LearningException
	{
		ProgramBean pb1 = new ProgramBean();
		LearningService ls = new LearningService();
		pb1=ls.searchprogramdetails(pb);
		
		session.put("searchresult",pb1);  
		
		return "success";
		
	}
	
	public String insertfeedback() throws LearningException
	{
		Feedback fb = new Feedback();
		LearningService ls = new LearningService();
		fb.setFacultyid((String)session.get("facultyid"));
		fb.setProgramcode((String)session.get("programcode")); 
		ls.insertfeedback(fb);
		
		return "success";
	}
	 
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return pb;
	}

	
} 
