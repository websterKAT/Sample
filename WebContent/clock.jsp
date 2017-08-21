 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>clock</title>
</head>
<body>
<%
String userName = request.getParameter("name");

if(userName != null){
	session.setAttribute("sessionUserName",userName);
	application.setAttribute("applicationUserName", userName);
	pageContext.setAttribute("pageContextuserName",userName);
}
 
%>
<br/>
The userName in the request object is : <%=userName %>
<br/>
User Name in the session object is : <%=session.getAttribute("sessionUserName") %>
<br/>
User Name in the application context object is: <%=application.getAttribute("applicationUserName") %>
<br/>
User Name in the page Context object is <%=pageContext.getAttribute("pageContextuserName")%>
</body>
</html>   	