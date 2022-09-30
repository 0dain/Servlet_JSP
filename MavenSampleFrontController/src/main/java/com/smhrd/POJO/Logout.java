package com.smhrd.POJO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.controller.Command;

public class Logout implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 정보 저장하고 있는 세션 삭제
		// 세션 객체 생성해서 값 가져오기
		HttpSession session = request.getSession();

		// 가져온 세션 값 삭제
//		session.invalidate();//전체 삭제
		session.removeAttribute("loginM");// 부분삭제(로그인 정보 삭제)
		return "main.jsp";
	}

}
