<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz_result.jsp</title>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>
	
	<h4>이름 : ${param.name } (${param.age }세)</h4>
	<h4>${adult }입니다</h4>
	
	<button onclick="history.back()">뒤로</button>
</body>
</html>