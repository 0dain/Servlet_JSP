package com.smhrd.POJO;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.controller.Command;
import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class Join implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		// 요청 데이터 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");

		// mybatis(DB) -> 데이터를 묶어서 저장하고 묶어서 반환함
		Member vo = new Member(id, pw, nick);// import할 때 우리가 만든 클래스로!

		// DAO에 있는 메서드 불러오기
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(vo);

		// 페이지 이동 방식(redirecting, forwarding)
		if (cnt > 0) {
			// 가입 성공했을 꼉우
			request.setAttribute("result", "success");
			
		} else {
			// 가입 실패했을 경우
			request.setAttribute("result", "fail");
		}

		return "main.jsp";
	}

}
