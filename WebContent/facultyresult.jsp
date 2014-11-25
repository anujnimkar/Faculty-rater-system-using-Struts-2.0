<!--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: facultyresult.jsp

*Description    : This is the result page of the application for the faculty

*Created On     : 15-10-2012 

-----------------------------------------    --> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculty result</title>
</head>
<body>
<center><h1>Online Learning Solutions</h1></center><br><br>
<center><h1>Feedback Entry</h1></center><br><br>

<table bgcolor="#D1EDED" align="center"> 	
		<tr>
		<td>Welcome Faculty <s:property value="%{#session.facultyid}"/></td>
		<td><s:a href="Logout.action">Logout</s:a></td> 
		<td><s:a href="FacultyHomepage.action">Home</s:a></td>   
		</tr>
		
		<tr>
		<td>Page under Construction</td>   
		</tr>  
		
		      
	</table>     

</body>
</html>