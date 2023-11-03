<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form action="${cpath }/account/findID" method="POST">
		<h4>이메일로 ID 찾기</h4>
		<p><input name="email" type="email" placeholder="E-mail" required></p>
		
		<button>전송</button>
	</form>
	
	<br>
	
	<form action="${cpath }/account/findPW" method="POST">
		<h4>ID, 이메일로 임시 PW 발급받기</h4>
		<p><input name="email" type="email" placeholder="E-mail" required></p>
		<p><input name="userid" placeholder="ID" required></p>
		
		<button>전송</button>
	
	</form>
</section>

<%@ include file="../footer.jsp" %>