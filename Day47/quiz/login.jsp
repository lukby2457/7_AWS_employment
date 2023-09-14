<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<%! Account[] accs = new Account[] {
			new Account("test", "1234", "테스트"),
			new Account("itbank", "it", "아뱅"),
			new Account("admin", "qwe", "관리자")
		};
	
		public Account login(Account acc) {
			for (int i = 0; i < accs.length; i++) {
				if (acc.equals(accs[i])) {
					return accs[i];
				}
			}
			
			return null;
		}
	%>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		String save = request.getParameter("save");
		acc = login(acc);
	
		if (acc != null) {
			session.setAttribute("login", acc);
			session.setAttribute("save", save);
			response.sendRedirect("success.jsp");
		}
		else {
			response.sendRedirect("fail.jsp");
		}
	%>
</body>
</html>