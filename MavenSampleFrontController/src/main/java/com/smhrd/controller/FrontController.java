package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.POJO.Delete;
import com.smhrd.POJO.Join;
import com.smhrd.POJO.Login;
import com.smhrd.POJO.Logout;
import com.smhrd.POJO.Update;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청 데이터 인코딩 방식 지정
		request.setCharacterEncoding("UTF-8");

		// 어디에서 온 요청인지 url 확인
		String reqUri = request.getRequestURI();
		System.out.println(reqUri);

		String context = request.getContextPath();
		System.out.println(context);

		// 컨텍스트 안 보이게 자르기
		String resUri = reqUri.substring(context.length());
		System.out.println(resUri);

		Command comm=null;
		
		if (resUri.equals("/JoinCon.do")) {// forwarding
			comm=new Join();//업캐스팅
			String des=comm.execute(request, response);
			
			RequestDispatcher rd=request.getRequestDispatcher(des);
			rd.forward(request, response);
		} else {// redirecting
			if (resUri.equals("/LoginCon.do")) {
				comm=new Login();
			} else if (resUri.equals("/UpdateCon.do")) {
				comm=new Update();
			} else if (resUri.equals("/DeleteCon.do")) {
				comm=new Delete();
			} else if (resUri.equals("/LogoutCon.do")) {
				comm=new Logout();
			}
			String des=comm.execute(request, response);
			response.sendRedirect(des);
		}

	}

}
