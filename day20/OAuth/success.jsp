<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<% 
	String name=request.getParameter("name"); 
	String email=request.getParameter("email"); 
	out.println("Your Name -->"+name);
	out.println("Your Email -->"+email); 
%> 
 
</body>
</html>