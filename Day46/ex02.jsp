<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h1>Forward 테스트</h1>
	<hr>
	
	<h4>딱! 2가지만 기억하자</h4>
	
	<ol>
		<li>클라이언트는 페이지가 변경된걸 모른다</li>
		<li>요청(request)가 유지되며 페이지가 바뀐다</li>
	</ol>
	
	<form action="ex02_forward.jsp">
		<input name="name" placeholder="이름" required>
		<button>전송</button>
	</form>
	
</body>
</html>