package controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;

@WebServlet("/delete")
public class Delete extends HttpServlet {

	private static final long serialVersionUID = -8276231294489976522L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		BoardDAO dao = new BoardDAO();
		int row = dao.delete(idx);
		
		response.sendRedirect("home");
	}
	
}
