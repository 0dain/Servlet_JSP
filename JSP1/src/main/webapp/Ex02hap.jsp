<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1부터 100까지의 합 구하기 -->
	<%!
		int sum=0;
	%>
	
	<%! public int add(){
		
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		return sum;
	} 
	%>
	<!-- 방법 1. -->
	<%="1~100까지의 합: "+add() %>
	<!-- 방법 2.  -->
	<br>
	1~100까지의 합: <%=add() %>
</body>
</html>