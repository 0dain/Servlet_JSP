<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String site=request.getParameter("site");
		//sendRedirect: 현재 실행중인 jsp page(servlet)의 실행을 중단하고 다른 웹페이지가 대신 호출되도록 만드는 메서드
		if(site.equals("naver")){
		response.sendRedirect("http://www.naver.com");			
		}else if(site.equals("daum")){
			response.sendRedirect("http://www.daum.net");
		}else{
			response.sendRedirect("http://www.google.com");
		}
	%>
</body>
</html>