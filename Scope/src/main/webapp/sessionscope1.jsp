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
		//세션 영역에 값 저장
		session.setAttribute("nick", "핑구");
	
		//세션 영역에 값 가져 오기
		String nick=(String)session.getAttribute("nick");
	%>
	
	표현식 : <%=nick %>
	<br>
	el표기법 : ${nick}<br>
	<!-- sessionScope 영역 안에 있는 닉 값 가져오기 -->
	${sessionScope.nick }
	<a href="sessionscope2.jsp">2로 이동</a>
</body>
</html>