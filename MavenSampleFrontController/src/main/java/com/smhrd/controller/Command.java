package com.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//최종적으로 어디 페이지를 응답할 건지!
	public String execute(HttpServletRequest request, HttpServletResponse response);//추상메서드
	
}
