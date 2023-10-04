<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<c:set var="content" value="${dao.selectOne(param.idx) }"></c:set>

<article>
	<form action="updatePro.jsp" method="POST"><%-- 항상 같은 페이지에 있을거기 때문에 cpath를 사용하지 않아도 된다 --%>
		<table class="boards">
		<tr>
			<th>제목</th>
			<td><input name="title" placeholder="제목" required value="${content.title }"></td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td><input name="writer" placeholder="작성자" required value="${content.writer }"></td>
		</tr>
		<tr>
			<td colspan="2">
				<textarea name="contents" rows="9" cols="20">${content.contents }</textarea>
			</td>
		</tr>
	</table>
	
	<br>

	<input name="idx" type="hidden" value="${content.idx }">

	<button>작성</button>
	</form>
</article>

</body>
</html>