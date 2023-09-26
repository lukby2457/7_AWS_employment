<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<c:set var="boards" value="${dao.selectAll() }"/>
	
<article>
	<h4>오늘 날짜 : ${dao.test() }</h4>
	
	<table class="boards">
		<thead>
			<tr>
				<th>No</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성날짜</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${boards }">
			<tr>
				<td>${row.idx }</td>
				<td><a href="${cpath }/board/view.jsp?idx=${row.idx }">
					${row.title }</a>
				</td>
				<td>${row.writer }</td>
				<td>${row.view_count }</td>
				<td>${row.write_date }</td>
				<td>클릭</td>
				<td onclick="isDel(${row.idx}, '${cpath }')">클릭</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<script src="${cpath }/js/isDel.js"></script>
</article>
	
</body>
</html>