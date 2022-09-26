<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<%
		//로그아웃하면서 세션 다 지우기
		session.invalidate();
		
		//로그인 폼으로 다시 가기
		response.sendRedirect("loginform.html");
	%>
</body>
</html>