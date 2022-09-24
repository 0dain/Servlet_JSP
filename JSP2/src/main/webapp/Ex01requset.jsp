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
	request.setCharacterEncoding("UTF-8");
	
	String name=request.getParameter("name");
	int java=Integer.parseInt(request.getParameter("java"));
	int web=Integer.parseInt(request.getParameter("web"));
	int iot=Integer.parseInt(request.getParameter("iot"));
	int and=Integer.parseInt(request.getParameter("android"));
	
	double avg=(java+web+iot+and)/4;
	
	%>
	
	<fieldset>
	<legend>학점확인 프로그램</legend>
	<table align="center">
	<tr>
		<td width="200px">이름</td>
		<td><%=name%></td>
	</tr>
	<tr>
		<td>JAVA 점수</td>
		<td><%=java%></td>
	</tr><tr>
		<td>WEB 점수</td>
		<td><%=web%></td>
	</tr>
	<tr>
		<td>IOT 점수</td>
		<td><%=iot%></td>
	</tr>
	<tr>
		<td>ANDROID 점수</td>
		<td><%=and%></td>
	</tr>
	<tr>
		<td>평균</td>
		<td><%=avg%></td>
	</tr>
	<tr>
		<td>학점</td>
		<td ><strong><%
		if(avg>=95){
			out.print("A+");
		}else if(avg>=90){
			out.print("A");
		}else if(avg>=85){
			out.print("B+");
		}else if(avg>=80){
			out.print("B");
		}else{
			out.print("F");
		}
		%></strong></td>
	</tr>
	</table>
	</fieldset>

</body>
</html>