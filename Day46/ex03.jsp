<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
</head>
<body>
	<h1>pageScope</h1>
	<hr>
	
	<ul>
		<li>JSP에서 데이터를 저장하고 꺼내쓰기 위한 공간을 Attribute라고 한다</li>
		<li>Attribute를 가지는 4가지 객체가 있고 이를 pageScope라고 한다</li>
		<li>각 pageScope는 수명이 조금씩 다르다</li>
	</ul>
	
	<ol>
		<li>pageContext : 페이지마다 생성되고 응답이 끝나면 제거되는 객체. 즉, 현재 페이지에서만 유지</li>
		<li>request : pageContext와 동일한 수명. 단, forward시 다른 페이지에서도 유지됨</li>
		<li>session : 웹 브라우저가 종료되면 제거되는 객체</li>
		<li>application : 웹 서버가 종료되면 제거되는 객체</li>
	</ol>
	
	<h4>각 pageScope는 수명이 있지만 개발자가 직접 제거도 가능</h4>
	
</body>
</html>