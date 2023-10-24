<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book</title>
<link rel="stylesheet" href="${cpath }/resources/css/style.css">
</head>
<body>
	<h1>list</h1>
	<hr>
	
	<table class="board">
		<tr>
			<th>제목</th>
			<th>저자</th>
			<th>출판사</th>
			<th>출판일</th>
			<th>수정</th>
			<th>삭제</th>
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
			<td>
				<a href="${cpath }/book/update?idx=${row.idx }">클릭</a>
			</td>
			<td>
				<a href="${cpath }/book/delete?idx=${row.idx }">클릭</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<a href="${cpath }/book/add"><button>책등록</button></a>
	
</body>
</html>