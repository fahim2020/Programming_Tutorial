<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--  <link href=”bootstrap-3.3.7-dist/css/bootstrap.min.css” rel=”stylesheet” type=”text/css” /> -->
<style>
     <%@ include file="bootstrap-3.3.7-dist/css/bootstrap.min.css"%>
</style>
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
<title>Hello World!</title>
</head>
<body>
	<h1>Hello World!</h1>
	<h2>Let's do some JSP!</h2>
	<% out.println("Test"); %>
	<ul >
		<% for(int i = 0; i<5; i++){
			int iteration = i+1;
			out.println("<li>" + iteration + ". iteration</li>");	
		}
	%>
	</ul>
	 <br/>  
		<form action="LoginCheck.jsp" method="post">  
			Username:<input type="text" name="username"/><br/><br/>  
			Password:<input type="password" name="password"/><br/><br/>  
			<input type="submit" value="login"/> 
		</form> 
	
</body>
</html>