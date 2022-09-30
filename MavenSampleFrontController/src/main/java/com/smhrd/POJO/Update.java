package com.smhrd.POJO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;
import com.smhrd.model.Member;
import com.smhrd.model.MemberDAO;

public class Update implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 세션으로 받아와도 됨
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");

		Member vo = new Member(id, pw, nick);

		// 1. DAO - update 호출
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(vo);

		// 2. 수정성공 => main.jsp 이동 : '닉네임'님 환영합니다 출력(수정한 닉네임으로 떠야함)
		if (cnt > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("loginM", vo);
			return "main.jsp";

		} else {
			// 3. 수정실패 => update.jsp로 이동

			return "update.jsp";
		}
	}

}
