package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {

	private static final long serialVersionUID = -8753957661320028246L;	// 직렬화/역직렬화할때 사용

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("/home을 요청함!!!");
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.write("<!DOCTYPE html>\r\n");
		out.write("<html>\r\n");
		out.write("<head>\r\n");
		out.write("<meta charset=\"UTF-8\">\r\n");
		out.write("<title>home</title>\r\n");
		out.write("</head>\r\n");
		out.write("<body>\r\n");
		out.write("	  <h1>Hello Servlet</h1>\r\n");
		out.write("   <hr>\r\n");
		out.write("   <h4>View없이 Servlet만 사용했다</h4>\r\n");
		out.write("   <h5 style=\"color:red;\">Servlet에서 HTML적기 너무 귀찮음</h5>\r\n");
		out.write("</body>\r\n");
		out.write("</html>\r\n");
	}
	
	
}
