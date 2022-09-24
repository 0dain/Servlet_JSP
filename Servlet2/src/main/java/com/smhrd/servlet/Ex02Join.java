package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02Join")
public class Ex02Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청 데이터 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//요청
		String id=request.getParameter("ID");//아이디
		String pw=request.getParameter("PW");//비밀번호
		String pwch=request.getParameter("PWCH");//비밀번호 확인
		String gender=request.getParameter("gender");//성별
		String bloodT=request.getParameter("bloodT");//혈액형
//		int date=Integer.parseInt(request.getParameter("DATE"));//생년월일
		String date=request.getParameter("DATE");//생년월일
		String[] hobby=request.getParameterValues("hobby");//취미
		String color=request.getParameter("color");//좋아하는 색
		String tarea=request.getParameter("tarea");//남기고 싶은 말
		
	
		response.setContentType("text/html; charset=UTF-8");
		
		//응답		
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("아이디: "+id);
		out.print("<br>");
		out.print("비밀번호: "+pw);
		out.print("<br>");
		if(pw.equals(pwch)) {
			out.print("비밀번호가 일치합니다");
		}else {
			out.print("비밀번호가 일치하지 않습니다");
		}
		out.print("<br>");
		out.print("성별: "+gender);
		out.print("<br>");
		out.print("혈액형: "+bloodT);
		out.print("<br>");
		out.print("생일: "+date);
		out.print("<br>");
		out.print("취미: ");
		for(int i=0;i<hobby.length;i++) {
			out.print(hobby[i]+" ");
		}
//		out.print("취미: "+Arrays.toString(hobby));
		out.print("<br>");
		out.print("좋아하는 색: "+color);
		out.print("<br>");
		out.print("남기고 싶은 말: "+tarea);
		out.print("<br>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
