<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>MVC2 Test</h1>
	<hr>
	
	<ul>
		<li>WEB-INF 폴더는 웹 브라우저로 직접 접근 불가능</li>
		<li>서버에서 포워드로 이동시켜야 접근 가능</li>
	</ul>
	
	<form method="POST">
		<input name="age" type="number" placeholder="나이" required>
		<button>전송</button>
	</form>
	
</body>
</html>