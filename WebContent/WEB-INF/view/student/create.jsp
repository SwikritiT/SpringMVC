<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<form id="student-form" action=<%= request.getContextPath() + "/student" %> method="POST">
<input type="text" name="name" placeholder="enter student name"/>
<input type="submit"/>
</form>

</body>
</html>