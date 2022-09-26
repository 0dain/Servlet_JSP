<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 생성</title>
</head>
<body>
	<%
		//1. 세션 값 설정
		//세션 -> 내장 객체(JSP 상에서는 객체 생성 따로 하지 않음)
		//session(키(String), 값(Object))
		session.setAttribute("id", "smhrd");
		session.setAttribute("age", 20);
		
		//보내는 과정 필요 없음
	%>
	<a href="Ex05getSession.jsp">세션 확인</a>
		
</body>
</html>