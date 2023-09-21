<%@page import="beans.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/message.js"></script>
</head>
<body>
	<%!
		public void setCookies(HttpServletResponse response, AccountVO user, String save) {
			Cookie[] cs = new Cookie[] {
					new Cookie("idSave", user.getUserid()),
					new Cookie("save", "checked")
			};
			
			for (int i = 0; i < cs.length; i++) {
				cs[i].setMaxAge(0);
				
				if (save != null) {
					cs[i].setMaxAge(60*60*24);
				}
				
				response.addCookie(cs[i]);
			}
		}
	%>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="user" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="user"/>
	
	<%
		AccountDAO dao = new AccountDAO();
		user = dao.selectOne(user);
		
		String save = request.getParameter("idSave");
		
		if(user != null) {
			session.setAttribute("user", user);
			
			setCookies(response, user, save);
		}
		
		response.sendRedirect("home.jsp");
	%>

</body>
</html>