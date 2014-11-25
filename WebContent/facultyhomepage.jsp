<!--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: facultyhomepage.jsp

*Description    : This is the functionality page of the application for the faculty

*Created On     : 15-10-2012 

-----------------------------------------    -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculty home</title>
</head>
<body>

<center><h1>Online Learning Solutions</h1></center><br><br> 
<center><h1>Feedback Entry</h1></center><br><br>


<fieldset style="width:40%">
<legend>Faculty Home page</legend>
<s:form action="FacultyHomeAction" method="post" value="true">   
<center><h1>Faculty Home</h1></center> 
	<table bgcolor="#D1EDED" align="center">  	
		<tr>
		<td>Welcome Faculty <s:property value="%{#session.facultyid}"/></td>
		<td><s:a href="Logout.action">Logout</s:a></td>  
		<td><s:a href="FacultyLogin.action">Home</s:a></td>   
		</tr>
		
		<tr>
		<td><s:submit label="Search"/></td>   
		<td><s:select name="startdate" list="#{'1':'23-08-1989','2':'24-09-1989','3':'26-09-1989'}"></s:select></td>
		</tr>  
		
		      
	</table>     
</s:form>
</fieldset>     

</body>
</html>