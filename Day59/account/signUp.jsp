<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<fieldset class="inBlk">
		<legend>회원가입</legend>
		
		<form action="signUpPro.jsp" method="POST">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="userpw" type="password" placeholder="PW" required></p>
			<p><input name="userpw" type="password" placeholder="PW Check" required></p>
			<p><input name="nick" placeholder="닉네임" required></p>
			<p><input name="email" type="email" placeholder="E-mail" required></p>
			
			<h5 class="msg"></h5>
			
			<button>signUp</button>
		</form>
	</fieldset>
	
	<script src="../js/pwCheck.js"></script>

</body>
</html>