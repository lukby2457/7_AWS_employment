<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<h4>업로드</h4>

	<form method="post" enctype="multipart/form-data">
		<p><input name="uploader" placeholder="업로드명"></p>
		<p><input name="memo" placeholder="메모"></p>
		<p><input name="upload" type="file" required></p>
		
		<button>전송</button>
	</form>
	
</body>
</html>