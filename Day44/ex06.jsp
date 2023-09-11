<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06.jsp</title>
</head>
<body>
	<h1>request</h1>
	<hr>
	
	<ul>
		<li>서버 : 서비스를 제공하는 자</li>
		<li>클라이언트 : 서비스를 이용하는 자</li>
		<li>서버/클라이언트는 서로 요청/응답으로 데이터를 주고 받으며 상호작용한다</li>
		<li>요청은 클라이언트가 서버로 통신을 보내는 것</li>
		<li>응답은 서버가 올바른 요청에 대한 응답을 클라이언트로 보내는 것</li>
	</ul>
	
	<%
		// JSP는 요청을 처리하기 위해서 request라는 객체가 이미 생성되어 있다
		// 마찬가지로, 이도 내장 객체임
		
		String cpath = request.getContextPath();		// 프로젝트 최상위 경로
		String localAddr = request.getLocalAddr();		// 서버 IP 주소
		String remoteAddr = request.getRemoteAddr();	// 클라이언트 IP 주소
		int localPort = request.getLocalPort();			// 서버 port
		int remotePort = request.getRemotePort();		// 클라이언트 port
		String method = request.getMethod();			// 요청 메서드
		String protocol = request.getProtocol();		// 서버가 사용하는 프로토콜
		String uri = request.getRequestURI();			// URI : 자원 식별자
		StringBuffer url = request.getRequestURL();		// URL : 자원의 위치
		// String realPath = request.getRealPath("ex06.jsp");	
		// 실제 파일 위치. deprecated는 지원 중지된 함수 혹은 클래스로 사용하지 않는 것을 권장
		
		request.setCharacterEncoding("utf-8");
		String encoding = request.getCharacterEncoding();	
		// 세팅하지 않으면 null, UTF-8이 관례적
	%>
	
	<ul>
		<li><%=cpath %></li>
		<li><%=localAddr %></li>
		<li><%=remoteAddr %></li>
		<li><%=localPort %></li>
		<li><%=remotePort %></li>
		<li><%=method %></li>
		<li><%=protocol %></li>
		<li><%=uri %></li>
		<li><%=url %></li>
		<li><%=encoding %></li>
	</ul>
	
</body>
</html>