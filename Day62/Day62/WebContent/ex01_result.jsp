<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.MultipartResponse"%>
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
		String location = pageContext.getServletContext().getRealPath("/uploadEx"); // 저장할 위치
		int maxSize = 1024 * 1024 * 10; // 업로드 크기
		String encoding = "utf-8"; // 인코딩 방식
		DefaultFileRenamePolicy rename = new DefaultFileRenamePolicy(); // 이름이 겹칠시 숫자를 붙여준다
		
		MultipartRequest mr = new MultipartRequest(request, location, maxSize, encoding, rename);
		// 위의 것이 만들어지면 자동으로 업로드가 된다
		
		String name = mr.getParameter("name"); // 업로드할 이름
		File upload = mr.getFile("upload"); // 업로드할 파일
		
		if(!"".equals(name)) {
			String origin = upload.getName(); // 업로드할 파일명
			int dot = origin.lastIndexOf("."); // 마지막 . 위치
			String ex = origin.substring(dot); // .위치에서 마지막까지 자름 -> 확장명
			
			// System.out.println(origin);
			// System.out.println(dot);
			// System.out.println(ex);
			
			name += ex; // 이름 + 확장명
			
			File fname = new File(upload.getParent(), name);
			
			upload.renameTo(fname); // 파일 이름 변경
		}
	%>

	<h1>업로드 결과</h1>
	<hr>
	
	<ul>
		<li>파일명 : <%=name %></li>
		<li>업로드 위치 : <%=upload %></li>
	</ul>
	
	<button onclick="history.back()">뒤로</button>
	
</body>
</html>