<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead  here</title>
</head>
<body>
<h2>Lead details:-</h2>
<br>
First Name= ${lead.firstName}<br>
Last Name= ${lead.lastName}<br>
Email Name= ${lead.email}<br>
Mobile Name= ${lead.mobile}<br>
Source Name= ${lead.source}<br>
<form action="sendEmail" method="post">
<input type="hidden" name="email" value="${lead.email}"/>
<input type="submit" value="Send Email"/>
</form>

<form action="convert" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>