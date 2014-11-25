<!--  ---------------------------------------

*Author         : Anuj S Nimkar

*Page Name 		: programdetails.jsp

*Description    : This is the page of the application where search results for a specific program are printed

*Created On     : 15-10-2012  

-----------------------------------------    -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Program details and feedback</title>
</head>
<body>
<center><h1>Online Learning Solutions</h1></center><br><br>
<center><h1>Feedback Entry</h1></center><br><br>

<fieldset style="width:40%">
<legend>Program details and feedback page</legend>
<s:form action="submitfeedback" method="post" value="true">   
<center><h1>Program details and feedback page</h1></center> 
	<table bgcolor="#D1EDED" align="center"> 
		<tr>
		<td>Program code:<s:property value="%{#session.searchresult.programcode}"/></td>
		<td>Faculty Id:<s:property value="%{#session.searchresult.facultyid}"/></td>
		<td>Location:<s:property value="%{#session.searchresult.location}"/></td>
		</tr>
		
		<tr>
		<td>Start date:<s:property value="%{#session.searchresult.startdate}"/></td>
		<td>End date:<s:property value="%{#session.searchresult.enddate}"/></td>
		</tr>
		
		<tr>
		<td>Best Program Rating:5</td>
		<td>Rate this program:
		<s:select name="programrating" 
				list="#{'1':'1','2':'2','3':'3','4':'4','5':'5'}"> 
		</s:select> 
		
		</td>
		</tr>
		
		
		<tr>
		<td>Worst Program rating:1</td>
		<td><s:submit label="OK"/></td> 
		</tr>
	
	</table>

</s:form>
</fieldset>

</body>
</html>