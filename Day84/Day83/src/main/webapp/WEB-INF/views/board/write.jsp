<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST" enctype="multipart/form-data">
		<table class="board">
			<tr>
				<th><label for="title">제목</label></th>
				<td><input name="title" id="title" required></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input name="writer" required></td>
			</tr>
			<tr>
				<th>대표 이미지</th>
				<td><input name="imgFile" type="file" accept="image/*"></td>
			</tr>
			<tr>
				<td colspan="2"><textarea class="writeText" name="contents" required></textarea></td>
			</tr>
		</table>
	
		<br>
		
		<button>작성</button>
	</form>
	
</body>
</html>