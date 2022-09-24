<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤 당첨 결과</title>
</head>
<body>
	<fieldset align="center">
		<legend>랜덤 당첨 결과</legend>
	<%
	
	String topic=request.getParameter("topic");
	
	String[] item=request.getParameterValues("item");
	
	//아이템 중에서 랜덤으로 1개 뽑기
	Random rd=new Random();
	//방법 1.
	int result=rd.nextInt(item.length);	
	//방법 2.
	//String rdItem=item[rd.nextInt(item.length)];
	%>
	
	<p><%=topic %></p>
	<!-- 방법 1. -->
	<p><%=item[result] %></p>
	<!-- 방법 2.
	  	꺽새%=rdItem%꺽새
	  -->
	
	</fieldset>
	
	
</body>
</html>