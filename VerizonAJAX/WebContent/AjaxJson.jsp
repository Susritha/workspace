<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="application/javascript">
function loadJSON()
{
var data_file="Data.json";
var http_request=new XMLHttpRequest();

http_request.onreadystatechange=function(){
if(http_request.readyState==4)

{
var jsonObj=JSON.parse(http_request.responseText);
document.getElementById("Name").innerHTML=jsonObj.Name;
document.getElementById("Country").innerHTML=jsonObj.Country;
}
}
http_request.open("GET",data_file,true);
http_request.send();
}
</script>
</head>
<body>
<h1>Cricketer Details</h1>
<table border="1">
<tr><th>Name</th><th>Country</th></tr>
<tr><td><div id="Name">Sachin</div></td><td><div id="Country">India</div></td></tr>

</table>
<div class="central">
<button type="button" value="UpdateDetails" onclick="loadJSON()">Update</button>
</div>
</body>
</html>

