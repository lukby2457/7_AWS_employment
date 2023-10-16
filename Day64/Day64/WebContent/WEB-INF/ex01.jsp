<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>MVC2</h1>
	<hr>
	
	<h4>View는 화면에 보여줄 페이지를 의미</h4>

	<ul>
	  <li>JSP 파일로 구현하며</li>
	  <li>보통 URL로 직접 접근을 제한하기 위해서</li>
	  <li>WEB-INF 아래 작성한다</li>
	  <li>이 페이지는 /test1로 접근 가능</li>
	  <li>${msg }</li>
	</ul>

	<%-- action을 생락하면 현재 페이지에 데이터 전송 --%>
	<form method="POST">
		<p><input name="name" placeholder="이름" required></p>
		
		<button>전송</button>
	</form>
</body>
</html>