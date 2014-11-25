<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student login</title>
</head>
<body>
<fieldset style="width:40%">
<legend>Student Login page</legend>
<s:form action="StudentLoginAction" method="post" name="studentloginform" value="true">  
<center><h1>Student Login</h1></center> 
	<table bgcolor="#D1EDED" align="center"> 	
		<tr><td><s:textfield name="username" label="Username"/></td></tr>
		<tr><td><s:password name="userid" label="Userid"/></td></tr>  
		<tr><td><s:submit label="submit" align="center"/></td></tr>         
	</table>      
</s:form>
</fieldset>       

</body>
</html>