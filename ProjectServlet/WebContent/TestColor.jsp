<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String col=request.getParameter("color"); %>
<%! char x; %>
<% x=col.charAt(1); %>
<% switch(col.charAt(0)){
case 'r' : %> <h2> Color is red </h2> 
<%break;
case 'b' : %> <h2>Color is blue </h2>
<%break;
}%>

</body>
</html>