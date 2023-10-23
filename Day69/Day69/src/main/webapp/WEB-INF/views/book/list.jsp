<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book</title>
</head>
<body>
	<h1>list</h1>
	<hr>
	
	<table>
		<tr>
			<th>제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>출판일</th>
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>
				<a href="${cpath }/book/view?idx=${row.idx }">
					${row.title }
				</a>
			</td>
			<td>${row.writer }</td>
			<td>${row.publisher }</td>
			<td>${row.p_date }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>