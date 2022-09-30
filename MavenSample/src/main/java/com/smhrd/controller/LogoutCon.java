package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 정보 저장하고 있는 세션 삭제
		//세션 객체 생성해서 값 가져오기
		HttpSession session=request.getSession();
		
		//가져온 세션 값 삭제
//		session.invalidate();//전체 삭제
		session.removeAttribute("loginM");//부분삭제(로그인 정보 삭제)
		
		//main.jsp보여주기
		response.sendRedirect("main.jsp");
		
	}

}
