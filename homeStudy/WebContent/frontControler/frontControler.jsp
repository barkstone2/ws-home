<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<a href="insert.do">insert</a>
	<hr/> 
	<a href="http://localhost:8181<%=request.getContextPath() %>/frontControler/update.do">update</a>
	<hr/>
	<a href="http://localhost:8181/homeStudy/frontControler/select.do">select</a>
	<hr/>
	<a href="<%=request.getContextPath()%>/frontControler/delete.do">delete</a>
	
</body>
</html>