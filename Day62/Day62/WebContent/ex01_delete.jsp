<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_delete.jsp</title>
</head>
<body>

	<%
		String fname = request.getParameter("fname");
	
		String location = pageContext.getServletContext().getRealPath("/uploadEx");
		File file = new File(location, fname);
		
		System.out.println(file);
		file.delete();
	%>
	
	<script>
		alert("삭제가 완료되었습니다");
		location.href = "ex01.jsp";
	</script>

</body>
</html>