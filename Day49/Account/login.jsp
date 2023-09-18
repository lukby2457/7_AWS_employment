<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<article>
	<form action="loginPro.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>login</button>
	</form>
</article>

</body>
</html>