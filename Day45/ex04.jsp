<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.jsp</title>
</head>
<body>
	<h1>Response</h1>
	<hr>

	<%
		// 응답은 서버가 클라이언트에 통신하는 방식을 의미
		// JSP에서는 이 응답을 response라는 내장객체로 이미 제공 중
		// 주로, 쿠기, 리다이렉트 메세지, 에러 코드 등에 사용
		
		// response.sendError(401);
		// response.sendError(404, "없는 페이지 입니다");
		
		response.sendRedirect("ex02.jsp");
	 %>
	 
	 <%--
	 	많은 사람을 받기 위하여
	 	Web은 stateless, connectless 상태를 가지고 있다

		따라서 request가 끝나면 정보가 다 날라간다
	 	
	 	개인서비스를 주려면 user구분이 필요해짐
	 	session이라는 5계층을 활용해서 연결을 유지할 수 있다
	  --%>

</body>
</html>