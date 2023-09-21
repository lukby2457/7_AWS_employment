<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<article>
	<form action="signUpPro.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="userpw" type="password" placeholder="PW check" required></p>
		<p><input name="nick" placeholder="Nick" required></p>
		<p><input name="email" type="email" placeholder="Email" required></p>
		
		<button>signUp</button>
	</form>
	
	<p class="msg"></p>
</article>

<script src="../js/pwCheck.js"></script>

</body>
</html>