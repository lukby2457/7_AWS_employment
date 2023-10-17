package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;

@WebServlet("/home")
public class Home extends HttpServlet {

	private static final long serialVersionUID = -8753957661320028246L;
	private String path = "/WEB-INF/";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
//		RequestDispatcher rd;
//		rd = request.getRequestDispatcher(path + "home.jsp");
//		
//		rd.forward(request, response);
		
		BoardDAO dao = new BoardDAO();
		String date = dao.test();
		Map<String, Object> map = dao.selectAll();
		
		request.setAttribute("date", date);
		request.setAttribute("map", map);
		
		request
			.getRequestDispatcher(path + "home.jsp")
			.forward(request, response);
	}
	
}
