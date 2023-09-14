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
		String save = request.getParameter("save");
		String name = request.getParameter("name");
		
		// System.out.println(save);
		
		// Cookie(String name, String value)
		// - value에 session은 Object, cookie는 String
		Cookie ck = new Cookie("name", name);
		ck.setMaxAge(0);
		
		if (save != null) {
			ck.setMaxAge(60*60*24*7);
		}
		
		response.addCookie(ck);
	%>
	

	<h1>결과</h1>
	<hr>
	
	<h4>쿠키 발급!!! 개발자 도구로 확인</h4>
	
	<a href="ex01.jsp">
		<button>ex01</button>
	</a>
	
</body>
</html>