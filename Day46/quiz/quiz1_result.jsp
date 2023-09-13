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
	
	<%! 
		Account[] accs = new Account[] {
			new Account("test1", "1234"), 
			new Account("itbank", "it"), 
			new Account("admin", "qwe")
		};
	%>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		String site = "quiz1_fail.jsp";	
	
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].equals(acc)) {
				site = "quiz1_success.jsp";
			}
		}
		
		if (site.equals("quiz1_fail.jsp")) {
			response.sendRedirect(site);
		}
		else {
			response.sendRedirect(site);
		}
	%>
</body>
</html>