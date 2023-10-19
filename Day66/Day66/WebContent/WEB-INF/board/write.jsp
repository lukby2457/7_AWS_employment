<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<c:set var="board" value="${result }"></c:set>

<section>
	<form method="POST">
		<table class="view write">
		<tr>
			<th>제목</th>
			<td><input name="title" placeholder="제목" required value="${board.title }"></td>
		</tr>
		<tr>
			<td colspan="2"><textarea name="contents" rows="9" cols="20">${board.contents }</textarea></td>
		</tr>
	</table>
	
	<br>
	
	<input name="writer" type="hidden" value="${user.nick }">
		
	<button>작성</button>
	</form>
</section>

<%@ include file="../footer.jsp" %>