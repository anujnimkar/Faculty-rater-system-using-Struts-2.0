/*--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: LearningDao.java

*Description    : This is the page where the interaction with the database takes place

*Created On     : 15-10-2012 

*Note:DriverManager has been used with prior permission

----------------------------------------- */ 

package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.beans.Feedback;
import com.company.beans.LoginBean;
import com.company.beans.ProgramBean;
import com.company.exceptions.LearningException; 

public class LearningDao {
	
	Connection conn = null; 
	
	public LearningDao() throws LearningException
	{
		try
		 { 
			/*obj.load(new FileInputStream("resources/config.properties")); */
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.212.74.18:1521:testDB","fbp22","fbp22#456");
		 } 
		
		catch(SQLException e)
		{
			throw new LearningException("Connection error.."); 
		}
	}//end constructor LearningDao
	
	public boolean isFacultyExists(LoginBean lb) throws LearningException
	{
		boolean flag=false;
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement("select * from user_805698 where usertype=?");
			pstmt.setString(1,"faculty");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString("userid").equals(lb.getUserid()))
				{
					flag=true;
					break;
				}
			}//end while
		}
		
		catch(SQLException e)
		{
			throw new LearningException("Error in faculty login..");
		}
		finally
		{
			try {
				conn.close();
				
			} 
			catch (SQLException e)  
			{
				e.printStackTrace();
				
			} 
		}//end finally
		
		return flag;
		
	
	}//end function isFacultyExists 
	
	
	
	public boolean isStudentExists(LoginBean lb) throws LearningException
	{
		boolean flag=false;
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement("select * from user_805698 where usertype=?");
			pstmt.setString(1,"student");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString("userid").equals(lb.getUserid()))
				{
					flag=true;
					break; 
				}
			}//end while
		}
		
		catch(SQLException e)
		{
			throw new LearningException("Error in student login..");
		}
		finally
		{
			try {
				conn.close();
				
			} 
			catch (SQLException e)  
			{
				e.printStackTrace();
				
			} 
		}//end finally
		
		return flag;
		
	
	}//end function isStudentExists 
	
	public ProgramBean searchprogramdetails(ProgramBean pb) throws LearningException
	{
		ProgramBean pb1;
	try
	{
		PreparedStatement pstmt = conn.prepareStatement("select * from programdetails_805698 where programcode=? and facultyid=?");
		pstmt.setString(1,pb.getProgramcode());
		pstmt.setString(2,pb.getFacultyid());
		ResultSet rs = pstmt.executeQuery();
		
		pb1 = new ProgramBean(); 
		
		while(rs.next())
		{
			if(rs.getString("facultyid").equals(pb.getFacultyid()))
			{
				pb1.setFacultyid(rs.getString("facultyid"));
				pb1.setLocation(rs.getString("location"));
				pb1.setProgramcode(rs.getString("programcode"));
				pb1.setStartdate(rs.getDate("startdate"));
				pb1.setEnddate(rs.getDate("enddate"));  
			}
		}//end while
     }
	catch(SQLException e)
	{
		throw new LearningException("Error in retrieving the program details..");
	}
	
	finally
	{
		try {
			conn.close();
			
		} 
		catch (SQLException e)  
		{
			e.printStackTrace();
			
		} 
	}//end finally
	
	return pb1; 
	
	
	}//end searchprogdetails
	
	public void insertfeedback(Feedback fb) throws LearningException
	{
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement("insert into program_facultyfeedback_805698 values(?,?,?)");
			pstmt.setString(1,fb.getProgramcode());
			pstmt.setString(2,fb.getFacultyid());
			pstmt.setString(3,fb.getRating());
			pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			throw new LearningException("Error in inserting the program details..");
		}
		
		finally
		{
			try {
				conn.close();
				
			} 
			catch (SQLException e)  
			{
				e.printStackTrace();
				
			} 
		}//end finally 
		
		
	}//end insertfeedback
	

}
