<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String id1 = request.getParameter("user");
String id2 = request.getParameter("password");%>
<%
if((id1.equals("admin")) && (id2.equals("admin"))){%>
<%@ page session="true" %>
<% session.setAttribute("user","admin"); %>
<jsp:forward page="Admin.jsp"></jsp:forward>


<%} else if((id1.equals("susritha")) && (id2.equals("susritha")))  {%>
<%@ page session="true" %>
<% session.setAttribute("user1","susritha"); %>
<jsp:forward page="User.jsp"></jsp:forward>

<%}else if((id1.equals("")) || (id2.equals(""))){ %>
<jsp:forward page="Empty.jsp"></jsp:forward>
<%@ page session="true" %>
<%}else { %>
<jsp:forward page="Invalid.jsp"></jsp:forward>
<%@ page session="true" %>
<%} %>
</body>
</html>