package controller.account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AccountVO;
import model.AccountDAO;
import service.Hash;

@WebServlet("/login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 95756138028678929L;
	private String path = "/WEB-INF/";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request
			.getRequestDispatcher(path + "account/login.jsp")
			.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		userpw = Hash.getHash(userpw);
		
		AccountVO input = new AccountVO();
		input.setUserid(userid);
		input.setUserpw(userpw);
		
		AccountDAO dao = new AccountDAO();
		AccountVO result = dao.selectOne(input);
		String date = dao.test();
		
		request.setAttribute("date", date);
		
		HttpSession session = request.getSession();
		session.setAttribute("user", result);
		
		String cpath = request.getContextPath();
		
		response.sendRedirect(cpath);
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("user");
	}

	
}
