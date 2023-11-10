<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>업로드 - 수정</h4>
	
	<form method="POST">
		<p><input name="uploader" placeholder="업로더" required value="${row.uploader }"></p>
		<p><input name="memo" placeholder="메모" required value="${row.memo }"></p>
		<p><input name="name" placeholder="이름" required value="${row.name }"></p>
		<button>전송</button>	
	</form>

</body>
</html>