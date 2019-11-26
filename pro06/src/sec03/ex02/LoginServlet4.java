package sec03.ex02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login4")
public class LoginServlet4 extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("Init 메서드 호출");
	}

	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet메서드 호출");
		doHandle(request, response); //GET방식으로 요청 시 다시 doHandle()을 호출합니다.
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response); //Post 방식으로 요청시 다시 doHandle()을 호출합니다.
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		System.out.println("doHandle 메서드 호출");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디" + user_id);
		System.out.println("비밀번호"+ user_pw);
		
		
	}
	
	public void destroy() {
		System.out.println("Destroy메서드 호출");
	}
}
