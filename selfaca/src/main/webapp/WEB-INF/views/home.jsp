<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰 홈</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
</head>
<body>
	<div id="frame">
		<header>
			<div id="menu">
				<nav class="menu" id="mainMenu">
					<a href="/" class="mainMenu">홈으로</a>
					<a href="#" class="mainMenu">남성</a>
					<a href="#" class="mainMenu">여성</a>
					<a href="#" class="mainMenu">커뮤니티</a>
					<a href="#" class="mainMenu">고객센터</a>
				</nav>
				
				<nav class="menu" id="memberMenu">
					<a href="member/login" class="memberMenu">[로그인]</a>
					<a href="member/join" class="memberMenu">[가입하기]</a>
				</nav>
			</div>
		
		</header>
		<main>
			<div id="content">
			</div>
		</main>
		<footer>
		
		</footer>
	</div>


</body>
</html>
