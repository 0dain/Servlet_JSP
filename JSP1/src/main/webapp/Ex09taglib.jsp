<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- taglib: 태그 라이브러리에서 태그를 가져와서 사용하고 싶을 때  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
	prefix: JSTL 사용할 때 태그 앞에 붙일 접두사 
	uri: 태그 라이브러리 uri 식별자 
-->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 1~10 출력 -->
	<!-- jstl 반복문 -->
	
	<!-- 
	for(int i=1;i<=10;i++)이랑 같은 뜻임!{
	}
	 -->
	 <!-- 달러{ 변수 사용할 영역 } -->
	<c:forEach var="i" begin="1" end="10" step="1">
		${i}
	</c:forEach>
	
	<!-- c:forEach => jstl문
		달러{}: el언어
	 -->
	<c:forEach var="i" begin="1" end="9" step="1">
		3 * ${i} = ${3*i}
	</c:forEach>
	
</body>
</html>