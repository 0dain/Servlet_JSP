package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;


public class DeleteCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//세션으로 아이디 값 가져오기
		HttpSession session=request.getSession();
		Member loginM=(Member)session.getAttribute("loginM");
		
		//1. DAO - delete 호출
		MemberDAO dao=new MemberDAO();
		int cnt=dao.delete(loginM.getId());
		//2. 삭제 성공 => main.jsp 이동, 닉네임님 환영합니다 안 보이게 -> 로그인을 해주세요라는 문구가 보여야 함
		if(cnt>0) {
			session.removeAttribute("loginM");
			response.sendRedirect("main.jsp");
		}else {
			//3. 삭제 실패 => main.jsp 이동, 닉네임님 환영합니다 보이게
			response.sendRedirect("main.jsp");
		}
		
	}

}
