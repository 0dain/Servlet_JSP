<%@page import="com.smhrd.model.Member"%>
<%@page import="com.smhrd.model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <!-- el코드 인식 못 할 때: isELIgnored="false" 넣어주기 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//회원가입 시 쿼리값 가져오기
		//result의 값이 null일 경우가 null이 아닐 경우를 판단해서 실행할 수 있게 해줘야 함
		String result=request.getParameter("result");
	
		//request 영역 안의 값 가져오기
		String result1=(String)request.getAttribute("result");
		
		if(result!=null){//회원가입을 하고 온 후
			if(result.equals("success")){
				out.print("<h4>회원가입에 성공했습니다</h4>");
			}else{//fail이 넘어온 경우
				out.print("<h4>회원가입에 실패했습니다</h4>");
			}
		}
		
		if(result1!=null){//회원가입을 하고 온 후
			if(result1.equals("success")){
				out.print("<h4>회원가입에 성공했습니다</h4>");
			}else{//fail이 넘어온 경우
				out.print("<h4>회원가입에 실패했습니다</h4>");
			}
		}
	%>
	<!-- jstl 쓰는 법 -->
	<!-- 비어 있는지 확인 명령어(null): empty -->
	<c:if test="${!empty result}">
		<c:choose>
			<c:when test="${result eq 'success'}">
				<h4>회원가입에 성공했습니다</h4>
			</c:when>
			<c:otherwise>
				<h4>회원가입에 실패했습니다</h4>
			</c:otherwise>
		</c:choose>
	</c:if>
	
	<a href="join.jsp"><button>회원가입</button></a>
	<a href="login.jsp"><button>로그인</button></a>
	
	<!-- 로그인한 사용자의 정보 가져오기 -->
	<!-- 만약에 로그인을 하지 않은 경우, "로그인 해주세요" 화면 출력 / 로그인을 했다면 "'닉네임'님 환영합니다" 화면 출력 -->
	<%
		//세션에 있는 값 가져오기!
			//다운캐스팅
		Member loginM=(Member)session.getAttribute("loginM");	
		
		if(loginM==null){
			out.print("<h4>로그인 해주세요</h4>");
		}else{//loginM에 사용자의 정보가 담겨져 있는 경우(로그인 성공)
			out.print("<h4>"+loginM.getNick()+"님 환영합니다</h4>");
		}
	%>
	
	<!-- JSTL로 작성해보기! 
		조건: test
	-->
	<!-- 세션 키 값 가져오기!! 변수 가져오는 거 아님!!! -->
	<c:choose>
		<c:when test="${empty loginM}">
			<h4>로그인 해주세요</h4>
		</c:when>
		<c:otherwise>
			<h4>${loginM.nick}님 환영합니다</h4>
			<a href="update.jsp"><button>개인정보수정</button></a>
			<a href="delete.jsp"><button>회원탈퇴</button></a>
			<a href="LogoutCon"><button>로그아웃</button></a>
		</c:otherwise>
	</c:choose>
	
	
</body>
</html>