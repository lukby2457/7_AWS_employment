<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form method="POST">
		<table class="view write">
		<tr>
			<th>제목</th>
			<td><input name="title" placeholder="제목" required></td>
		</tr>
		<tr>
			<td colspan="2"><textarea name="contents" rows="9" cols="20"></textarea></td>
		</tr>
	</table>
	
	<br>
	
	<input name="writer" type="hidden" value="${user.nick }">
		
	<button>작성</button>
	</form>
</section>

<%@ include file="../footer.jsp" %>