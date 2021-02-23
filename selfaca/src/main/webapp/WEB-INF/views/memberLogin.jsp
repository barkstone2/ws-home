<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form name="mLoginForm" method="post" action="loginProc">
		아이디 : <input type="text" name="mId"><br>
		비밀번호 : <input type="password" name="mPw"><br>
		<input type="submit" value="로그인">
		<input type="button" value="홈으로" onclick="location.href='/'">
	</form>
</body>
</html>