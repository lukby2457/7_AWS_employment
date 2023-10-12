<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_result.jsp</title>
</head>
<body>
	<%
		String location = pageContext.getServletContext().getRealPath("/uploadEx");
		int maxSize = 1024 * 1024 * 1024;
		String encoding = "utf-8";
		
		MultipartRequest mr = new MultipartRequest(request, location, maxSize, encoding);
		
		File name = mr.getFile("upload");
		// Enumeration en = mr.getFileNames(); 파라미터 이름 반환 (파일 이름x)
		File dir = new File(name.getParent());
		
		response.sendRedirect("ex02.jsp");
	%>
	
	<ul>
		<li><%=name %></li>
		
		<% for(String f : dir.list()) { %>
		<li>이름 : <%=f %></li>
		<% } %>
		<%-- multiple로 파일을 보내면 파일 업로드는 되지만 목록을 불러오기는 힘들다 --%>
	</ul>
</body>
</html>