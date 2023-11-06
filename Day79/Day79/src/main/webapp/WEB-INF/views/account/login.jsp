<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>전송</button>
	</form>
	
	<a href="${cpath }/account/find">
	<button>ID/PW 찾기</button>
	</a>
</section>

<%@ include file="../footer.jsp" %>