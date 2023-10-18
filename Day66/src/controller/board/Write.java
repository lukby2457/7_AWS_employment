package controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BoardVO;
import model.BoardDAO;

@WebServlet("/write")
public class Write extends HttpServlet {

	private static final long serialVersionUID = -9152830134436211276L;
	private String path = "/WEB-INF/";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request
			.getRequestDispatcher(path + "board/write.jsp")
			.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String contents = request.getParameter("contents");
		
		BoardVO input = new BoardVO();
		input.setTitle(title);
		input.setWriter(writer);
		input.setContents(contents);
		
		BoardDAO dao = new BoardDAO();
		int row = dao.insert(input);
//		System.out.println(row != 0 ? "성공" : "실패");
		
		response.sendRedirect("home");
	}
	
}
