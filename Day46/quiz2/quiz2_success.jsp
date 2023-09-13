<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4><%=request.getParameter("userid") %>님 로그인 성공</h4>
	
	<button onclick="history.back()">뒤로</button>
</body>
</html>