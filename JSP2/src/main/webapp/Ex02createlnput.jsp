<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤 당첨 목록 작성</title>
</head>
<body>
	<fieldset align="center">
		<legend>랜덤 당첨 작성</legend>
		<form action="Ex02randomWinner.jsp">
		주제:
		<input type="text" name="topic">
		<br>
		<%
		int num=Integer.parseInt(request.getParameter("num"));
		for(int i=1;i<=num;i++){
			out.print("아이템"+i+": <input type='text' name='item'> <br>");
		} %>
		<input type="submit" value="시작">
		</form>
	</fieldset>

</body>
</html>