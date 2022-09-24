<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendRedirect</title>
</head>
<body>
	<!-- 네이버로 이동하고 싶은 요청 받음 -->
	<%
		//sendRedirect: 현재 실행중인 jsp page(servlet)의 실행을 중단하고 다른 웹페이지가 대신 호출되도록 만드는 메서드
		response.sendRedirect("http://www.naver.com");
	%>
</body>
</html>