package com.smhrd.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02parameter")
public class Ex02parameter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getParameter: 문자열 반환, 여러 개일 땐 맨 앞의 값만 가져옴
		//getParameterValues: 여러 개의 값을 가지고 올 때 사용 => 반환 타입 String[]
		
		String job=request.getParameter("job");
		String gender=request.getParameter("gender");
		String[] hobby=request.getParameterValues("hobby");
		
		System.out.println(job);
		System.out.println(gender);
		System.out.println(Arrays.toString(hobby));
		
		
	}

}
