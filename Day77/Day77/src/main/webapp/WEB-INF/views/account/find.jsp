<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form action="findID">
		<h4>이메일로 ID 찾기</h4>
		<p><input name="email" type="email" required></p>
		
		<button>전송</button>
	</form>
</section>

<%@ include file="../footer.jsp" %>