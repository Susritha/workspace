<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Transact">
Enter Account number:
<input type="text" name="accnum"/><br><br>
Select the transaction
<select name="type">
<option value="withdraw">withdraw</option>
<option value="deposit">deposit</option>
</select><br><br>
Enter the amount : 
<input type="text" name="amount"/><br><br>
<input type="submit" name="submit" value="submit"/>
</form>

</body>
</html>