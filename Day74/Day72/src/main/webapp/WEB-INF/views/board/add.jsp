<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form method="POST">
		<table class="add">
			<tr>
				<th>제목</th>
				<td><input name="title" required value="${row.title }"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input name="writer" required value="${row.writer }"></td>
			</tr>
			<tr>
				<td colspan="2">
					<textarea name="contents">${row.contents }</textarea>
				</td>
			</tr>
		</table>
		
		<button>전송</button>
	</form>
</section>

</body>
</html>