<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List your contacts here</title>
</head>
<body>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
</tr>

<c:forEach var="contacts" items="${contacts}">
<tr>
<td><a href="contactInfo?id=${contacts.id}">${contacts.firstName}</a></td>
<td>${contacts.lastName}</td>
<td>${contacts.email}</td>
<td>${contacts.mobile}</td>
<td>${contacts.source}</td>
</tr>

</c:forEach>





</table>
</body>
</html>