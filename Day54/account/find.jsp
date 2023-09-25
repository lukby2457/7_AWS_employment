<%@page import="java.util.UUID"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<article class="accFind">
	<fieldset>
		<legend>ID 찾기</legend>
	
		<form action="findID.jsp" method="POST">
			<p><input name="email" type="email" placeholder="E-mail" required></p>
			
			<button>find</button>
		</form>
	</fieldset>
	
	<fieldset>
		<legend>PW 찾기</legend>
	
		<form action="findPW.jsp" method="POST">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="email" type="email" placeholder="E-mail" required></p>
			
			<button>find</button>
		</form>
	</fieldset>
	
	<%
		String newPw = UUID.randomUUID().toString().substring(0, 6);	// chain기법
	
		System.out.println(newPw);
	%>
</article>

</body>
</html>