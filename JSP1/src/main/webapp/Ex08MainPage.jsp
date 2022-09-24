<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex08 메인 페이지</title>
</head>
<body>
	메인 페이지<br>
	<a href="Ex08SubPage.jsp">서브 페이지로 이동!</a>
	<!-- include 지시자: 현재 페이지에 다른 파일의 내용을 삽입할 때 사용 -->
	<%@ include file="Ex08footer.jsp" %>
	<!-- file(속성)="같은 경로 안에 있으니까 파일 이름 적어주면 됨"  -->
</body>
</html>