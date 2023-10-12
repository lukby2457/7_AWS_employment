<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_update_1.jsp</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String rename = request.getParameter("rename");
		
		int dot = name.lastIndexOf('.');
		String ex = name.substring(dot);
		
		rename += ex;
		
		String location = pageContext.getServletContext().getRealPath("uploadEx");
		File update = new File(location, name);
		
		update.renameTo(new File(update.getParent(), rename));
		
		response.sendRedirect("ex01pro.jsp");
	%>
</body>
</html>