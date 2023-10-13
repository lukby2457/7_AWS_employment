<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.multipart.FileRenamePolicy"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%
	String location = pageContext.getServletContext().getRealPath("/board/image");
	int maxSize = 1024 * 1024 * 100;
	String encoding = "utf-8";
	DefaultFileRenamePolicy rename = new DefaultFileRenamePolicy();

	MultipartRequest mr = new MultipartRequest(request, location, maxSize, encoding, rename);
	
	String title = mr.getParameter("title");
	String writer = mr.getParameter("writer");
	String contents = mr.getParameter("contents");
	File upload = mr.getFile("upload");
	String path = "";
	
	if(upload != null) {
		path = "'image/" + upload.getName() + "'";
	}
	else {
		path = "default";
	}
	
	pageContext.setAttribute("title", title);
	pageContext.setAttribute("writer", writer);
	pageContext.setAttribute("contents", contents);
	pageContext.setAttribute("img_path", path);
%>

<c:set var="row" value="${dao.insert(title, writer, contents, img_path) }"/>

<script>
	let row = ${row};
	
	if(row != 0) {
		alert('글 작성 성공');
		location.href = 'home.jsp';
	}
	else {
		alert('글 작성 실패');
		history.back();
	}
</script>

</body>
</html>