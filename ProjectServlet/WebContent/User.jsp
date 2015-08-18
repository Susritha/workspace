<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(session.getAttribute("user1")==null){%>
<h2>Please login!!!! </h2>
<a href="Login.jsp">logout</a>

<%} else{ %>
welcome
<% String id =  request.getParameter("user");%>
<h2><%=id %></h2>
<a href="Login.jsp">logout</a>
<%} %>
</body>
</html>