<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 삭제</title>
</head>
<body>
	<%
		//1. 삭제할 쿠키의 name과 똑같은 name을 가진 쿠키 객체 생성
		//키 값만 같게 설정하고 값은 빈 문자열로 놔두어도 됨
		Cookie cookie=new Cookie("test2","");
	
		//2. 유효 기간 0으로 설정
		cookie.setMaxAge(0);
		
		//3. 클라이언트에게 쿠키 전송
		response.addCookie(cookie);
	%>
	
	<a href="Ex02getCookie.jsp">쿠키 확인</a>
</body>
</html>