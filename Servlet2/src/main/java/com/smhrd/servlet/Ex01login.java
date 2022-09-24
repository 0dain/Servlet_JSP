package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01login")
public class Ex01login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//요청 데이터 인코딩
		// *코드 위치 중요! => 데이터를 받기 전에 인코딩 먼저 수행!!!
		request.setCharacterEncoding("UTF-8");//브라우저한테 알려주려고 쓰는 거임 그래서 아래처럼 setContentType 안 써도 됨
		
		//요청
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		System.out.println(id);
		System.out.println(pw);
		
		//응답
		
		//응답 데이터에 한글이 포함되어 있는 경우엔 인코딩 방식 지정 필수!
		//응답 하기 전에 인코딩 방식 적어주기!
		
		//응답데이터 인코딩
		//setCharacterEncoding: 데이터를 인코딩
		response.setCharacterEncoding("UTF-8");
		
		//setContentType: 응답 데이터의 형식 지정 -> 브라우저에게 응답 데이터의 정보를 전달함
		response.setContentType("text/html; charset=UTF-8");
		//setContentType("응답데이터의 형식; 인코딩 방식");
		//브라우저 화면상에서 한글이 출력되어야 할 땐 위의 과정을 꼭 거쳐야 함!
		
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print(id+"님 환영합니다");//한글 데이터를 출력해야 할 땐 인코딩을 해야 함
		out.print("</body>");
		out.print("</html>");
		
		
	}

}
