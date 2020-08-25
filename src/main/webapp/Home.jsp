<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<form action = "add" method = "POST">
         Product Name: <input type = "text" name = "name">
         <br />
         Description: <input type = "text" name = "description" />
         <br />
         <input type = "submit" value = "ADD" />
      </form><br />
         
      <form action = "fetch" method = "GET">
         Product ID: <input type = "text" name = "id">
         <br />
         <input type = "submit" value = "FETCH" />
      </form>
</body>
</html>