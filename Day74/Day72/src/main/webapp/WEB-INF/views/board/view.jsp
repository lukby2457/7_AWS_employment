<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<table class="view">
		<tr>
			 <th colspan="6">${row.idx }. ${row.title }</th>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${row.writer }</td>
			<th>조회수</th>
			<td>${row.view_count }</td>
			<th>작성일</th>
			<td>${row.write_date }</td>
		</tr>
		<tr>
			<td colspan="6"><pre>
${row.contents }
			</pre></td>
		</tr>
	</table>
	
	<div>
		<a href="${cpath}/board/update/${row.idx}">수정</a>
		<a href="${cpath}/board/delete/${row.idx}">삭제</a>
	</div>
	
	<h5 class="repTitle">댓글 (${repCount })</h5>
	
	<form method="POST">
		<table class="reply">
			<tr>
				<td colspan="2">
					<input name="nick" placeholder="작성자" required>
					<input name="board_idx" value="${param.idx}" type="hidden">
				</td>
			</tr>
			<tr>
				<td><textarea name="contents" placeholder="바른말을 사용합시다" required>
				</textarea></td>
				<td><button>작성</button></td>
			</tr>
		</table>
	</form>
	
	<table class="rep">
		<c:forEach var="rep" items="${repList }">
		<tr>
			<td>${rep.nick } (${rep.write_date })</td>
		</tr>
		<tr>
			<td><pre>
${rep.contents }
			</pre></td>
		</tr>
		</c:forEach>
	</table>
	
</section>

</body>
</html>