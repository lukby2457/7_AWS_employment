<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%-- jsp명은 같은 파일 위치를 찾는다 --%>
<%-- 나보다 상위는 ../ --%>
<%-- 상대경로로 하면 css 등 참조가 제대로 안 될 수 있다 --%>
<%-- 동일하게 참조하고 싶으면 최상위를 써야 한다 --%>
	
	<c:set var="board" value="${dao.selectOne(param.idx) }"></c:set>

<article>
	<table class="boards">
		<tr>
			<th colspan="6">${board.idx }. ${board.title }</th>
		</tr>
		<tr>
			<th>작성자</th>
			<th>${board.writer }</th>
			<th>조회수</th>
			<th>${board.view_count }</th>
			<th>작성일</th>
			<th>${board.write_date }</th>
		</tr>
		<tr>
			<td colspan="6"><pre>${board.contents }</pre></td>
		</tr>
	</table>
</article>

</body>
</html>