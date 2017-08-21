<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lizan Kiara</title>
</head>
<body>
<h3> This is Insane </h3>
<%!
	public int add(int a,int b){
		return a+b;
}
%>

<% int k = add(455545,7844551); %>
the value of the k is: <%=4+3%>
<br/>
<%for(int i = 0;i < 5;i++){
	%> 
	
	<br/>The new value of i = <%=i %>	

<%} %>

</body>
</html>