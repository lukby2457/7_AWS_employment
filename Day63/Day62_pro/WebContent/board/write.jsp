<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form action="writePro.jsp" method="POST" enctype="multipart/form-data">
	<table class="view">
		<tr>
			<th>제목</th>
			<td><input name="title" required></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input name="writer" required></td>
		</tr>
		<tr>
			<td colspan="2"><textarea name="contents"></textarea></td>
		</tr>
		<tr>
			<th>첨부 이미지</th>
			<td><input name="upload" type="file"></td>
		</tr>
		<tr>
			<td colspan="2"><button>작성</button></td>
		</tr>
	</table>
</form>

</body>
</html>