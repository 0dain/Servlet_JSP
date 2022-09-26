<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 체크</title>
</head>
<body>
	
	<%
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	
	if(id.equals("test")&&pw.equals("12345")){
		//닉네임 세션 생성
		session.setAttribute("nick", "까꿍밤");
		
		//main.jsp로 이동
		response.sendRedirect("main.jsp");//로그인 성공 시 main.jsp로 이동
	}else{
		response.sendRedirect("loginform.html");//로그인 실패 시 다시 로그인하는 곳으로 이동
	}
	%>
</body>
</html>