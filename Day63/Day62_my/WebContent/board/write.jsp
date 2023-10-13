<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<form action="writePro.jsp" method="POST" enctype="multipart/form-data">
		<table class="view">
			<tr>
				<th>제목</th>
				<td><input name="title" placeholder="제목" required></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input name="writer" placeholder="작성자" required></td>
			</tr>
			<tr>
				<td colspan="2"><textarea name="contents" rows="9" cols="125"></textarea></td>
			</tr>
			<tr>
				<th>첨부 이미지</th>
				<td><input name="upload" type="file" accept="image/*"></td>
			</tr>
			<tr>
				<td colspan="2"><button>작성</button></td>
			</tr>
		</table>
	</form>
</section>

</body>
</html>