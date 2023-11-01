<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<table>
		<tr>
			<th>IDX</th>
			<th>title</th>
			<th>writer</th>
			<th>publisher</th>
			<th>price</th>
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td><a href="${cpath }/book/view?idx=${row.idx}">
				${row.title }
			</a></td>
			<td>${row.writer }</td>
			<td>${row.publisher }</td>
			<td>${row.price }</td>
		</tr>
		</c:forEach>
	</table>
	
	<div class="bottom">
	<a href="${cpath }/book/add">테이블 추가</a>
	
	<form method="POST">
		<select name="type">
			<option value="title">제목</option>
			<option value="writer">저자</option>
			<option value="publisher">출판사</option>
		</select>
		
		<input name="search" value="${map['search'] }">
		
		<button>전송</button>
	</form>
	</div>
</section>

</body>
</html>