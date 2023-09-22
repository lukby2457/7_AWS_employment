<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
<style>
	fieldset { display: inline-block; }
</style>
</head>
<body>
	<%--
		attribute : 개발자가 직접 세팅한 값
		parameter : 외부에서 가져오는 값
	 --%>

	<h1>EL - Parameter</h1>
	<hr>
	
	<form>
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="age" type="number" placeholder="나이" required></p>

		<button>전송</button>
	</form>
	
	<hr>
	
	<fieldset>
		<legend>표현식</legend>
		
		<p>이름 : <%=request.getParameter("name") %></p>
		<p>나이 : <%=request.getParameter("age") %></p>
		<p>나이 + 3 : <%=request.getParameter("age") + 3 %></p>
		<p>나이 + 3 : <%=Integer.parseInt(request.getParameter("age")) + 3 %></p>
	</fieldset>
	
	<fieldset>
		<legend>EL</legend>
		
		<%--
			${이름 } : Attribute 접근
			${param.이름 } : Parameter 접근
		 --%>
		<p>이름 : ${param.name }</p>
		<p>나이 : ${param.age }</p>
		<p>나이 + 3 : ${param.age + 3 }</p>
		<p>나이 + 3 : ${param.age + 3 }</p>
		<%-- EL은 알아서 타입을 판별한다 --%>
	</fieldset>
</body>
</html>