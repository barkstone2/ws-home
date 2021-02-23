<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<%
	
	try{
		String service = (String)request.getAttribute("service");
		int result = (Integer)request.getAttribute("result");
		if(service.equals("mJoin")){
			if(result>0){
				out.print("<script>alert('회원가입 성공');location.href='/self';</script>");
			}else{
				out.print("<script>alert('회원가입 실패');location.href='/self';</script>");
			}
		}else{
			out.print("<script>alert('잘못된 접근입니다.');location.href='/self';</script>");
		}
	}catch(Exception e){
		out.print("<script>alert('잘못된 접근입니다.');location.href='/self';</script>");
	}
	
	
	

%>


    