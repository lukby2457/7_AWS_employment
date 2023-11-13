<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST" enctype="multipart/form-data">
		<table class="board">
			<tr>
				<th>제목</th>
				<td><input name="title" required value="${board.title }"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input name="writer" required value="${board.writer }"></td>
			</tr>
			<tr>
				<th>대표 이미지</th>
				<td><input name="imgFile" type="file" accept="image/*"></td>
			</tr>
			<tr>
				<td colspan="2"><textarea class="writeText" name="contents" required>
${board.contents }
				</textarea></td>
			</tr>
		</table>
	
		<br>
		
		<input name="img" type="hidden" value="${board.img }">
		
		<button>작성</button>
	</form>
	
</body>
</html>