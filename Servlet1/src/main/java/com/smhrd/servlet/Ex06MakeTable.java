package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex06MakeTable")
public class Ex06MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		int num=Integer.parseInt(request.getParameter("num"));//문자열을 정수형으로 형변환
		
		//응답
		PrintWriter out=response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1>");
		out.print("<tr>");
//		셀이 100개가 필요하다면 반복문을 사용해서 내용을 넣어주면 됨
		for(int i=1;i<=num;i++) {
			out.print("<td>"+i+"</td>");			
		}
		out.print("</tr>");		
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
