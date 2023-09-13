<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_result.jsp</title>
</head>
<body>
	<h1>Forward 결과</h1>
	<hr>
	
	<h4><%=request.getParameter("name") %>님 안녕하세요</h4>
	
	<h4>※ URL을 확인해 보세요</h4>
	
	<%-- ex02_forward.jsp?name=홍길동 --%>
	
</body>
</html>