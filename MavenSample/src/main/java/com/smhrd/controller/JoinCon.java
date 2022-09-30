package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//요청 데이터 인코딩 방식 지정
		request.setCharacterEncoding("UTF-8");
		
		//요청 데이터 가져오기
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String nick=request.getParameter("nick");
		
		//mybatis(DB) -> 데이터를 묶어서 저장하고 묶어서 반환함
		Member vo=new Member(id, pw, nick);//import할 때 우리가 만든 클래스로!
		
		//DAO에 있는 메서드 불러오기
		MemberDAO dao=new MemberDAO();
		int cnt=dao.join(vo);
		
//		System.out.println(cnt);
		
		//페이지 이동 방식(redirecting, forwarding)
		if(cnt>0) {		
		//가입 성공했을 꼉우
		//1. main.jsp이동
		//2. "success" 데이터(문구) 보내기
			
			//redirecting
			//쿼리스트링 방식을 사용해 데이터 전송("main.jsp(경로) ? result=success(쿼리스트링)") -> 코드 작성할 땐 띄어쓰기 금지!
//			response.sendRedirect("main.jsp?result=success");//경로가 같아서 파일 이름만 써주는 것임! 괄호 안엔 경로를 써줘야 함
		
			//forwarding
			RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
			request.setAttribute("result", "success");
			rd.forward(request, response);
		} else {
		//가입 실패했을 경우
		//1. main.jsp 이동
		//2. "fail" 데이터(문구) 보내기
			//redirecting
//			response.sendRedirect("main.jsp?result=fail");
					
			//forwarding
			RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
			request.setAttribute("result", "fail");
			rd.forward(request, response);
		}
	}

}
