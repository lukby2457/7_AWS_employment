<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_update.jsp</title>
</head>
<body>
	<%
		String rename = request.getParameter("rename");
		String fname = request.getParameter("fname");
		
		String location = pageContext.getServletContext().getRealPath("/uploadEx");
		File file = new File(location, fname);
		
		int dot = fname.lastIndexOf(".");
		String ex = fname.substring(dot);
		
		rename += ex;
		
		File renameFile = new File(file.getParent(), rename);
		
		file.renameTo(renameFile);
		
		response.sendRedirect("ex01.jsp");
	%>
	
	
</body>
</html>