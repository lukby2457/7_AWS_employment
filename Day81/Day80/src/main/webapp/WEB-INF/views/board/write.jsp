<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<form method="POST">
	<table>
		<tr>
			<th>제목</th>
			<td><input name="title" required></td>
		</tr>
		<tr>
			<td colspan="2"><textarea name="contents" required></textarea></td>
		</tr>
	</table>
	
	<br>
	
	<input name="writer" type="hidden" value="${user.nick }">
	
	<button>작성</button>
</form>

</body>
</html>