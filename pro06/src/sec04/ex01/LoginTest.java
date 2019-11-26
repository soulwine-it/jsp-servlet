package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {

	
	public void init() {
		System.out.println("init메서드 호출");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		if(id != null &&(id.length() !=0)) {
			out.print("<html>");
			out.print("<body>");
			out.print( id + "님께서 로그인 하셨습니다!");
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("아이디를 입력해주세요!");
			out.print("<br>");
			out.print("<a href='http://localhostL8090/pro06/test01/loginTest.html'> 로그인 창으로 이동</a>");
			out.print("</body>");
			out.print("</html>");
		}
		
	}
	public void destroy() {
		System.out.println("destory메서드 호출");
	}
	
}
