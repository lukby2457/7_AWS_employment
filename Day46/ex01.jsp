<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>Forward</h1>
	<hr>
	
	<%--
		redirect
		- 서버에서 클라이언트에 지정 페이지로 이동하라는 메세지를 전달
		- 따라서, 클라이언트가 어디로 이동할지 알고 있다
		- 내 서버 페이지 뿐만 아니라 외부 사이트로도 이동 가능
		
		forward
		- 서버 내에서 다른 페이지로 이동 시키는 방식
		- 따라서, 클라이언트는 페이지가 변경된 사실을 알아차리지 못 함
		- 오로지 자신의 서버 내 페이지로만 이동 가능
		- 페이지 이동시 request가 유지된다!!!
		
		forward는 요청과 응답이 별도로 관리가 되어야 하는 경우 사용한다
		ex) MVC2, Spring MVC
		
		※ MVC
		- 어플리케이션 디자인 패턴을 의미
		- Model View Controller의 약자
	 --%>
	
	<%
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("quiz/quiz1.jsp");
		
		rd.forward(request, response);
		// 주소창에 quiz/quiz1.jsp가 아니라 ex01.jsp로 표시된다
	%>
	
</body>
</html>