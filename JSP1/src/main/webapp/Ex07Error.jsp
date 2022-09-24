<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="Ex07ErrorPage.jsp"%>
    <!-- errorPage="Ex07ErrorPage.jsp": 에러 페이지 지정="같은 경로에 있으니까 파일 이름(확장자 포함해서) 써주면 됨!"  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
	<%=2/0 %>
</body>
</html>