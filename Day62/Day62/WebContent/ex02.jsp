<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h1>다중 파일 업로드</h1>
	<hr>
	
	<form action="ex02_result.jsp" method="POST" enctype="multipart/form-data">
		<p><input name="upload" type="file" multiple required></p>
		
		<button>업로드</button>
	</form>
	
	<%-- 업로드 후 목록을 아래 출력 --%>
	
	<%
		String location = pageContext.getServletContext().getRealPath("/uploadEx");
		File dir = new File(location);
		pageContext.setAttribute("list", dir.list());
	%>
	
	<ul>
		<c:forEach var="f" items="${list }">
			<li>${f }</li>
		</c:forEach>
	</ul>
	
	<%-- 업로드된 파일 전체를 보고 싶으면 .file --%>

</body>
</html>