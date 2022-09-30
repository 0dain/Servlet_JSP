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
		//pagesope1.jsp값 가지고 오기(=> 다른 페이지 영역에 저장된 값 가지고 올 수 없음!)
		String nick=(String)pageContext.getAttribute("nick1");
	
	%>
	
	<!-- 출력 안 됨~ 다른 페이지라서! -->
	<%=nick %>
	
	${nick1}
	
</body>
</html>