<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<script>
		alert("환영합니다");
	</script>
	<%
		//세션-닉네임
		String nick=(String)session.getAttribute("nick");
		
		out.print(nick+"님 환영합니다");
	%>
	
	<a href="logout.jsp">로그아웃</a>
	
</body>
</html>