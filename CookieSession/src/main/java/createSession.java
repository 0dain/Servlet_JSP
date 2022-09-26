

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/createSession")
public class createSession extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//session: servlet에서는 객체 생성을 해야 사용할 수 있음
		//session객체 생성
		HttpSession session=request.getSession();//import해주기!
		
		int[] number= {1,2,3};
		session.setAttribute("number",number);
		
		//만들어진 세션 확인을 위해 Ex05getSession.jsp로 이동하기(웹에서 경로 찾아갈 땐 브라우저에 뜨는 url을 봐야함! 
		response.sendRedirect("Ex05getSession.jsp");//Ex05getSession.jsp가 같은 경로에 있기 때문에 파일 이름 적어준 거임
		
	}

}
