<%@page import="dto.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
					cs[i].setMaxAge(60*60*24*7);
				}
				
				response.addCookie(cs[i]);
			}
		}
	%>
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="user" class="dto.AccountVO"/>
	<jsp:setProperty property="*" name="user"/>
	<%-- userid, userpw만 전달됨 --%>
	
	<%
		AccountDAO dao = new AccountDAO();
		user = dao.selectOne(user);
		
		// user가 null이 아니면 -> 로그인 성공
		
		String save = request.getParameter("idSave");
		
		
		if(user != null) {
			// 성공시 세션에 저장해서 로그인 상태를 유지 시킨다 -> 홈으로 리다이렉트
			session.setAttribute("user", user);
			
			setCookies(response, user, save);
		}
		
		response.sendRedirect("home.jsp");
	%>
	
</body>
</html>