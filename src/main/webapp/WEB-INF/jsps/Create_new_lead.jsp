<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create here</title>
</head>
<body>
<h2>Create Lead</h2>
<form action="save" method="post">
<pre>
First Name<input type="text" name="firstName"/>
Last Name<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
Mobile<input type="text" name="mobile"/>
source:
<select name="source">
  <option value="radio">Radio</option>
  <option value="newspaper">NewsPaper</option>
  <option value="websites">Websites</option>
  <option value="television">Television</option>
</select>
</pre>
<input type="submit" value="save"/>

</form>
</body>
</html>