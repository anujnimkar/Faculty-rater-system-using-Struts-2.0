<!--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: studenthomepage.jsp

*Description    : This is the homepage of the application for the student

*Created On     : 15-10-2012  

-----------------------------------------    -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Home</title>
</head>
<body>
<center><h1>Online Learning Solutions</h1></center><br><br>
<center><h1>Feedback Entry</h1></center><br><br>

<fieldset style="width:40%">
<legend>Student Home page</legend>
<s:form action="StudentHomeAction" method="post" value="true">  
<center><h1>Student Home</h1></center> 
	<table bgcolor="#D1EDED" align="center"> 	
		<tr>
		<td>Welcome student<s:property value="%{#session.studentid}"/></td>
		<td><s:a href="Logout.action">Logout</s:a></td>  
		<td><s:a href="StudentLogin.action">Home</s:a></td>     
		</tr>
		
		<tr>
		<td><s:submit label="Search"/></td>   
		<td>
			<s:select name="programcode" 
				list="#{'Marketing_Advertising':'Marketing_Advertising','Fashion':'Fashion','Architecture':'Architecture','Quality':'Quality','Business_Management':'Business_Management'}">
			</s:select>
			<s:select name="facultyid" 
				list="#{'Fac_01':'Fac_01','Fac_02':'Fac_02','Fac_03':'Fac_03','Fac_04':'Fac_04','Fac_05':'Fac_05'}">
			</s:select> 
			
		</td>
		
		
		
		</tr>  
		
		      
	</table>     
</s:form>
</fieldset>     

</body>
</html>