<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<table>
		<tr>
			<th>IDX</th>
			<th>title</th>
			<th>writer</th>
			<th>price</th>
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td><a href="${cpath }/book/view?idx=${row.idx}">
				${row.title }
			</a></td>
			<td>${row.writer }</td>
			<td>${row.price }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="${cpath }/book/add">테이블 추가</a>
</section>

</body>
</html>