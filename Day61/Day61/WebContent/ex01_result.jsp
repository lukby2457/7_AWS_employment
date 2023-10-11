<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_result.jsp</title>
</head>
<body>
	<%
		String location = pageContext.getServletContext().getRealPath("/") + "upload";
		int maxSize = 1024 * 1024 * 1024;		// 1GB
		String encoding = "utf-8";
		DefaultFileRenamePolicy rename = new DefaultFileRenamePolicy();
	
		// 아래 MultipartRequest 인스턴스를 생성하면 바로 업로드가 진행됨
		MultipartRequest mr = new MultipartRequest(request, location, maxSize, encoding, rename);
	
		File upload = mr.getFile("upload");
	%>

	<h1>결과</h1>
	<hr>
	
	<%-- 
		<%=request.getRealPath("/") %> 밑의 것으로 대체됨
		<%=pageContext.getServletContext().getRealPath("/") %>
	 --%>
	
	<ul>
		<li>메모 : <%=mr.getParameter("memo") %></li>
		<li>업로드 파일명 : <%=upload %></li>
	</ul>
	
	<button onclick="history.back()">뒤로</button>

</body>
</html>