<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	 <h4>ID/Nick 중복 확인</h4>

	<form>
		<p><input name="userid" placeholder="아이디" required></p>
		<p><input name="userpw" type="password" placeholder="패스워드" required></p>
		<p><input name="nick" placeholder="닉네임" required></p>
		<p><input name="email" type="email" placeholder="이메일" required></p>
		
		<button>가입</button>
	</form>
	
	<script src="${cpath }/resources/js/quiz2.js"></script>
</section>

</body>
</html>