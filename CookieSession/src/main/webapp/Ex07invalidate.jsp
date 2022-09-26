<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 전체 삭제</title>
</head>
<body>
	<%
		//세션 전체 삭제
		session.invalidate();//호출만 하면 됨
	%>
	
	<a href="Ex05getSession.jsp">세션 확인</a>
</body>
</html>