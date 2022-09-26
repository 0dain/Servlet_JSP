<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 정보 출력</title>
</head>
<body>
	<%
		//클라이언트가 저장하고 있는 쿠키를 서버로 전송(클라이언트 -> 서버): request
		Cookie[] cookies=request.getCookies();//getCookies(): 배열형태로 반환
		
		//쿠키 정보 출력(키, 값) => 키:값 출력
		for(Cookie c:cookies){
			out.print(c.getName()+" : "+c.getValue()+"<br>");//getName(): 키 값 가지고 올 수 있음 / getValue(): 실제 값 출력
		}
		
	%>
	
	<a href="Ex03RemoveCookie.jsp">쿠키 삭제</a>
	
</body>
</html>