<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Server Pages </title>
</head>
<body>
<h1>Sample JSP</h1>
<%! int x=10; %>
<%=x %>
<%= ++x %>
<h2>value of x is <%=x %></h2>
</body>
</html>