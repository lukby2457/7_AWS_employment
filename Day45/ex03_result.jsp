<%@page import="beans.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03_result.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<h1>결과</h1>
	<hr>
	
	<jsp:useBean id="per" class="beans.Person"/>
	<%-- useBean : 지정 타입 클래스의 인스턴스를 생성하는 태그. 아래 Java코드와 동일 --%>
	<%-- Person per = new Person(); --%>
	
	<%-- 
		<jsp:setProperty name="per" property="name" param="name"/>
			= per.setName("hong");
			- property는 객체의 필드를 의미
			- param은 전달된 파라미터를 의미
			
			※ property와 param의 이름이 동일하면 생략 가능
	--%>
	
	<jsp:setProperty property="*" name="per"/>
	<%-- *는 이름이 동일한 공간에 1:1로 모두 대입해준다 --%>
	
	<ul>
		<li><%=per.getName() %></li>
		<li><%=per.getAge() %></li>
		<li><%=per.getHeight() %></li>
	</ul>
	
</body>
</html>