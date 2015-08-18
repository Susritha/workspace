<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">

<tr>
<th>Empcode<th>Ename<th>Salary</tr>

<c:forEach var="e" items="${empls}">
<tr>
<td><c:out value="${e.empcode}"></c:out></td>
<td><c:out value="${e.ename}"></c:out></td>
<td><c:out value="${e.salary}"></c:out></td>
</tr>

 </c:forEach>
</table>
Welcome employee!!!<br>
Employee code : ${e.empcode}<br>
Employee name: ${e.ename}<br>
salary : ${e.salary}<br>
</body>
</html>