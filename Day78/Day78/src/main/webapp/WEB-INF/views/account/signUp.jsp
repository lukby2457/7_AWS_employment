<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="nick" placeholder="Nick" required></p>
		<p><input name="email" type="email" placeholder="E-mail" required></p>
		
		<button>전송</button>
	</form>
</section>

<%@ include file="../footer.jsp" %>