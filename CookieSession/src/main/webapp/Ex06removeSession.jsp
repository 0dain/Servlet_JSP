<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>특정 세션 삭제</title>
</head>
<body>
	<%
		//특정 세션 삭제
		session.removeAttribute("age");
	%>
	<a href="Ex05getSession.jsp">세션 확인</a>
</body>
</html>