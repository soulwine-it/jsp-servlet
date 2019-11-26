package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guguTest")
public class GuguTest extends HttpServlet {
	
	public void init() {
		System.out.println("init 메서드 호출");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int dan = Integer.parseInt(request.getParameter("dan")); //전송된 단의 값을 받아옵니다.
		
		out.print("<table border=1 width=800 align=center>");
		out.print("<tr align=center bgcolor='#FFFF66'>");
		out.print("<td colspan=4>" + dan + "단 출력 </td>");
		out.print("</tr>");
		
		for(int i = 1; i<10; i++) {
			if( i % 2 == 0) { //짝수와 홀수의 배경색 설정
				out.print("<tr align=center bgcolor='#ACFA58'>");
				
			}else {
				out.print("<tr align=center bgcolor='#81BEF7'>");
			}
			
			// 체크박스와 라디오박스를 표시해주자 
			out.print("<td width=200>");
			out.print("<input type='radio' />"+ i);
			out.print("</td>");
			out.print("<td width=200>");
			out.print("<input type='checkbox' />" + i);
			out.print("</td>");
			
			out.print("<td width=400>");
			out.print(dan + "*" + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(i * dan);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
	}

}
