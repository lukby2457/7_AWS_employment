<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_update.jsp</title>
</head>
<body>
	<h1>파일 이름 변경</h1>
	<hr>

	<form action="ex01_updatePro.jsp">
		<p><input name="rename" placeholder="변경할 이름"></p>
		<input name="fname" type="hidden" value="${param.fname }">
		
		<button>전송</button>
	</form>
</body>
</html>