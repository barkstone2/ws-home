<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>
	<p>Modify Book</p>
	
	<form action="/p07001/book/modCon" method="get">
		name : <input type="text" name="name" value="${b.name}"><br>
		author : <input type="text" name="author" value="${b.author}"><br>
		isbn : ${b.isbn}<br>
		<input type="hidden" name="isbn" value="${b.isbn}">
		price : <input type="text" name="price" value="${b.price}">
		<input type="submit" value="Modify">
	</form>
	
</body>
</html>