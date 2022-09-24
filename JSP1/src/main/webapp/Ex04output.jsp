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
		/* post 방식으로 한글 데이터 전송시 인코딩! */
		request.setCharacterEncoding("UTF-8");
		/* request: 객체가 없어도 사용가능! => 내장 객체 */
		String value=request.getParameter("value");
	%>
	
	<%=value %>
	
</body>
</html>