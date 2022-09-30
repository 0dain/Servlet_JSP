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
	//application 영역에 값 저장
	application.setAttribute("nick", "핑구");

	//application 영엑에 있는 값 가져오기
	String nick = (String) application.getAttribute("nick");
	%>

	<%=nick%><br>
	${nick}
	<!-- application영역 안에 있는 닉을 가져오는 것
	
	이거 왜 씀?! -> 같은 이름의 키 값을 구분하여 가져 오고 싶을 때!
	 좀 더 정확한 값을 가져오고 싶다면!? -->
	${applicationScope.nick }

	<a href="applicationscope2.jsp">2로 이동</a>
</body>
</html>