package controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BoardVO;
import model.BoardDAO;

@WebServlet("/update")
public class Update extends HttpServlet {

	private static final long serialVersionUID = -3288468882956186846L;
	private String path = "/WEB-INF/";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardDAO dao = new BoardDAO();
		BoardVO result = dao.selectOne(idx);
		
		request.setAttribute("result", result);
		request.getRequestDispatcher(path + "board/write.jsp?idx=" + idx).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String cpath = request.getContextPath();
		
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardVO input = new BoardVO();
		input.setIdx(idx);
		input.setTitle(title);
		input.setContents(contents);
		
		BoardDAO dao = new BoardDAO();
		int row = dao.update(input);
//		System.out.println(row != 0 ? "성공" : "실패");
		
		response.sendRedirect(cpath + "/board?idx=" + idx);
	}
	
	
	
}
