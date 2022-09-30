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
		//request 영역 안에 값 저장 request(키(String),값(Object))
		request.setAttribute("nick", "핑구");
	
		//값 가져오기
		String nick=(String)request.getAttribute("nick");//다운캐스팅(강제형변환)
		//요청한 것에 응답을 하고나면 저장하고 있던 값을 유지하지 않음!
		
		//forwarding방식 사용
		/* RequestDispatcher rd=request.getRequestDispatcher("requestscope2.jsp");
		rd.forward(request,response); */
		//실행 후 주소창을 보면 주소는 여기 페이지가 뜨는데 화면에 뜨는 내용은 2.jsp내용이 보임
		
	%>
	
	표현식 : <%=nick %><!-- 자바 변수 값 -->
	<br>
	el표기법 : ${nick}<!-- 키 값 -->
	<br>
	<!--requestScope 영역 안에 있는 닉 값 가져옴  -->
	${requestScope.nick }
	<a href="requestscope2.jsp">2로 이동</a>
</body>
</html>