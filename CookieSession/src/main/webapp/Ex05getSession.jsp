<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 확인</title>
</head>
<body>
	<%
		//세션 값 가져오기
		//강제 형변환 해줘야 함 => setAttribute(): Object 타입이기 때문!
		//getAttribute 반환 타입: Object -> 비어 있으면 -> null 반환
		String id=(String)session.getAttribute("id");
		Integer age=(Integer)session.getAttribute("age");//null값 가질 수 있음
		//int age=(int)session.getAttribute("age"); null값 가질 수 없음 -> 그래서 실행하면 오류가 뜸!(null값을 반환해줘야 하는데 int형은 null값을 가질 수 없으니까!~)
		int[] arr=(int[])session.getAttribute("number");
	%>
	
	아이디: <%=id %><br>
	나이: <%=age %>
	<%=Arrays.toString(arr) %>
	<br>	
	<a href="Ex06removeSession.jsp">세션 삭제</a>
	<br>
	<a href="Ex07invalidate.jsp">세션 전체 삭제</a>
</body>
</html>