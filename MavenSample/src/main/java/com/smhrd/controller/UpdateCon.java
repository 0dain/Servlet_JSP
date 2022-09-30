package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;


public class UpdateCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//인코딩
		request.setCharacterEncoding("UTF-8");
		
		//세션으로 받아와도 됨
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String nick=request.getParameter("nick");
		
		Member vo=new Member(id,pw,nick);
		
		//1. DAO - update 호출
		MemberDAO dao=new MemberDAO();
		int cnt=dao.update(vo);
	
		//2. 수정성공 => main.jsp 이동 : '닉네임'님 환영합니다 출력(수정한 닉네임으로 떠야함)
		if(cnt>0) {
			//이거는 바로 적용 안 됨, 로그아웃 했다가 와야 적용됨 ㅠㅠ
//			RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
//			request.setAttribute("nick", login.getNick()); -> Member 객체 따로 생성해야함
//			rd.forward(request, response);
			
			HttpSession session=request.getSession();
			session.setAttribute("loginM", vo);
			response.sendRedirect("main.jsp");
		}else {
			//3. 수정실패 => update.jsp로 이동
//			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			response.sendRedirect("main.jsp");
		}
	}

}
