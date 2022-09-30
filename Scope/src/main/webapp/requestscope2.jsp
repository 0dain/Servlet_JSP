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
		//requestscope1.jsp 값 가지고 오기
		String nick=(String)request.getAttribute("nick");//forward를 사용하기 전엔 값을 불러올 수 없음!
	%>
	여기는 2.jsp!!!
	<%=nick %>
	${nick}
</body>
</html>