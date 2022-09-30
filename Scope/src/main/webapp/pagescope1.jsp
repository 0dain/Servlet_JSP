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
		//page영역: 특정 page안에서 선언한 값은 해당 페이지 내에서만 사용 가능(지역변수)
				
		//page영역 내에 값 저장 pageContext(키(String),값(Object))
		pageContext.setAttribute("nick1","핑구");
	
		//page영액 내에 값 가져오기 -> 우리가 지정한 키 값만 적어주면 됨
		String nick=(String)pageContext.getAttribute("nick1");//값이 Object 타입이기 때문에 강제 형변환 필요
	
		//forwarding 사용 => 서버 차원에서 이동은 했지만 값은 가지고 올 수 없음!
		//request영역 공유 가능!
	/* 	RequestDispatcher rd=request.getRequestDispatcher("pagescope2.jsp");
		rd.forward(request, response); */
	
	%>
	<!-- 자바코드 출력할 때는 변수를 가져와야 함 -->
	표현식 : <%=nick %>
	<br>
	<!-- el표기법: 페이지 내에 있는 값을 출력하는 것이기 때문에 키 값을 적어줘야 함! 변수명을 적는 것이 아님! -->
	el표기법 : ${nick1}
	<br>
	<!-- pagescope안의 닉을 가져오고 싶다 -->
	${pageScope.nick1 }
	<a href="pagescope2.jsp">2로 이동</a>
</body>
</html>