<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	방법 1.
	<table border=1>
	<tr>
	<!-- 방법 1. -->
    <%for(int i=1;i<=10;i++){
		out.print("<td>"+i+"</td>");
		/* out.print: 자바코드로 jsp가 컴파일 되면서 자동으로 객체를 생성해줌 => 내장 객체라고 불림  */
	}%>
	</tr>
	</table>
	
	방법 2.	
	<table border=1>
	<tr>	
	<!-- 방법 2.  -->
	<%for(int i=1;i<=10;i++){%>
		<td><%=i%></td>
	<%}%>	
	</tr>
	
	</table>
	
</body>
</html>