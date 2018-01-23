/*--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: LearningService.java

*Description    : This is the page where the business functionality is implemented

*Created On     : 15-10-2012 

-----------------------------------------    */ 

package com.company.service; 

import com.company.beans.Feedback;
import com.company.beans.LoginBean;
import com.company.beans.ProgramBean;
import com.company.dao.LearningDao;
import com.company.exceptions.LearningException;   

public class LearningService {
	
	public boolean isFacultyExists(LoginBean lb) throws LearningException
	{
		boolean flag = false;
		LearningDao ldao = new LearningDao();
		flag=ldao.isFacultyExists(lb);
		return flag; 
	}
	
	public boolean isStudentExists(LoginBean lb) throws LearningException
	{
		boolean flag = false;
		LearningDao ldao = new LearningDao();
		flag = ldao.isStudentExists(lb);
		return flag; 
	}
	
	public ProgramBean searchprogramdetails(ProgramBean pb) throws LearningException
	{
		ProgramBean pb1 = new ProgramBean();
		LearningDao ldao = new LearningDao();
		pb1=ldao.searchprogramdetails(pb);
		return pb1; 
	}
	
	public void insertfeedback(Feedback fb) throws LearningException
	{
		
		LearningDao ldao = new LearningDao();
		ldao.insertfeedback(fb); 
		
	}
}
