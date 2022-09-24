package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02HelloWorld")//이거는 절대로 지우면 안 됨!
public class Ex02HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter: 텍스트 출력(서버->클라이언트) 스트림(통로)
		PrintWriter out=response.getWriter();//import해줘야 함
		
		// html 태그는 문자열로!
		// html문서로 만드는 거
		// out: 통로 만드는 거
		// print: 입력
		out.print("<html>");
		out.print("<body style='background-color: pink;'>");
		out.print("<h1>hello wrold</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
