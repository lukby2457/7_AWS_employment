<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<c:set var="paging" value="${map['paging'] }"/>
<c:set var="list" value="${map['list'] }"/>

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
		<c:forEach var="row" items="${list }">
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
	
	<ul class="paging">
		<c:if test="${paging.prev }">
		<li><a href="${cpath }/?page=${paging.begin - 1 }">
			이전
		</a></li>
		</c:if>
		
		<c:forEach var="page" begin="${paging.begin }" end="${paging.end }">
		<li><a href="${cpath }/?page=${page }">
			${page }
		</a></li>
		</c:forEach>
		
		<c:if test="${paging.next }">
		<li><a href="${cpath }/?page=${paging.end + 1 }">
			다음
		</a></li>
		</c:if>
	</ul>
</section>

</body>
</html>