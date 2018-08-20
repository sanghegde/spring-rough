<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="align: center;"></div>
<table>
<tr>
<th>customer id</th>
<th>customername</th>
<th>contactnumber</th>
<th>email</th>
<th>balance</th>
<jstl:forEach var="customers" items="${sessionScope.list }">
<tr>
<td>${list.AccountHolderName }</td>
<td>${list.CustomerPhoneNumber }</td>
<td>${list.balance }</td>
<td>${list.CustomerEmailId }</td>
</jstl:forEach>
</tr>



</table>

</body>
</html>