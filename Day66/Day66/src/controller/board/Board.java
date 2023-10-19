package controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BoardVO;
import model.BoardDAO;

@WebServlet("/board")
public class Board extends HttpServlet {

	private static final long serialVersionUID = -6961320869608862263L;
	private String path = "/WEB-INF/";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardDAO dao = new BoardDAO();
		int row = dao.update_view(idx);
		BoardVO result = dao.selectOne(idx);
		
		request.setAttribute("result", result);
		request.getRequestDispatcher(path + "board/view.jsp?idx=" + idx).forward(request, response);
	}
	
}
