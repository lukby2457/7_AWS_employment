<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form method="POST">
		<p><input name="userid" placeholder="ID" required value="${acc.userid }"></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="nick" placeholder="Nick" required value="${acc.nick }"></p>
		<p><input name="email" type="email" placeholder="E-mail" required value="${acc.email }"></p>
		
		<button>작성</button>
	</form>
</section>

</body>
</html>