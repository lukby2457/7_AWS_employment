<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<table>
		<tr>
			<th>책번호</th>
			<td>${book.idx }</td>
		</tr>
		<tr>
			<th>책제목</th>
			<td>${book.title }</td>
		</tr>
		<tr>
			<th>책저자</th>
			<td>${book.writer }</td>
		</tr>
		<tr>
			<th>출판사</th>
			<td>${book.publisher }</td>
		</tr>
		<tr>
			<th>출판일</th>
			<td>${book.p_date }</td>
		</tr>
		<tr>
			<th>책가격</th>
			<td>${book.price }</td>
		</tr>
	</table>
	
	<button onclick="history.back()">뒤로</button>
	<a href="${cpath }/book/update/${book.idx}">수정</a>
	<a href="${cpath }/book/delete/${book.idx}">삭제</a>
</section>

</body>
</html>