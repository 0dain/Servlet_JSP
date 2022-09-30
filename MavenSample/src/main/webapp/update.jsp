<%@page import="com.smhrd.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <!-- el코드 인식 못 할 때: isELIgnored="false" 넣어주기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Member loginM=(Member)session.getAttribute("loginM");//import 내가 만든 클래스로!
	%>
	<form action="UpdateCon" method="post">
		<!-- readonly:수정 못하게 하는 속성  -->
		아이디: <input type="text" name="id" value="<%=loginM.getId()%>" readonly><br>
		비밀번호: <input type="password" name="pw"><br>
		닉네임: <input type="text" name="nick" value="${loginM.nick}"><br>
		<input type="submit" value="개인정보수정">
	</form>
</body>
</html>