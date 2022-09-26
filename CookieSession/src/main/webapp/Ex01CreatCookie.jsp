<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성 및 전송</title>
</head>
<body>
	<%
		//1. 쿠키 생성
		//쿠키 객체 Cookie(키(String), 값(String)) 활용		
		Cookie cookie=new Cookie("test","firstcookie");
	
		//2. 쿠키 유효 기간 설정(초단위로 시간 지정)
		cookie.setMaxAge(60*60*24*365);//1년동안 유지
		// =====서버 역할(쿠키 생성, 값 수정)=====
		
		//3. 생성된 쿠키 클라이언트에게 보내기(서버->클라이언트): response
		response.addCookie(cookie);		
		
		//4. 쿠키 생성 후 바로 전송(유효 기간 설정 생략)
		response.addCookie(new Cookie("test2","smhrd"));
	%>
	
	<a href="Ex02getCookie.jsp">쿠키 확인</a>
</body>
</html>