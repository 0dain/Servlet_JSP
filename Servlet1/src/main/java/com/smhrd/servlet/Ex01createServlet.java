package com.smhrd.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@ 주석(annotation): 코드 실행에 영향 X, 컴파일할 때 영향을 미침
//@Webservlet: URL 맵핑 역할
@WebServlet("/Ex01")
public class Ex01createServlet extends HttpServlet {
	
	//객체 데이터를 입출력(스트림(자바 바이트)-통로)
	//객체: 바이트배열 형태로 변환(-> 직렬화)
	//바이트 배열 -> 객체 형태로 변환(-> 역직렬화)
	private static final long serialVersionUID = 1L;

	
	//1. init:  서블릿 객체를 초기화하는 역할
	//맨 처음에 딱 한 번만 실행, 초기값 설정할 때 사용
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출");
	}

	//2. destroy: 서블릿 객체를 종료해줌(없애줌)
	//서블릿이 종료될 때 마지막에 딱 한 번 자동으로 호출
	public void destroy() {
		System.out.println("destroy 호출");
	}

	
	//3. service: 클라이언트의 요청 처리
	//요청방식(get, post, put, delete...)에 따라 doGet, doPost 메서드를 호출하는 역할
	//HttpServletRequest: HTTP 요청 정보 제공
	//HttpServletResponse: HTTP 응답 정보 제공
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 방식에 따라 호출할 거를 여기에 적어주면 됨
		// 요청 방식에 따라 다르게 호출 할 거면 doGet, doPost메서드에 각각 써주면 됨
		System.out.println("service 호출");
		doGet(request, response);
		doPost(request, response);
	}
	
	//4. 클라이언트에서 get방식으로 요청 시에 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
	}

	
	//5. 클라이언트에서 post방식으로 요청 시에 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		
	}

}
