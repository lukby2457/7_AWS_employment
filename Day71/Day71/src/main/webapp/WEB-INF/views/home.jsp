<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<h4>게시글</h4>

	<table class="board">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="row" items="${map }">
		<tr>
			<td>${row.idx }</td>
			<td><a href="${cpath }/board/view?idx=${row.idx }">
				${row.title }
			</a></td>
			<td>${row.writer }</td>
			<td>${row.view_count }</td>
			<td>${row.write_date }</td>
		</tr>
		</c:forEach>
	</table>
</section>

</body>
</html>