<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2</title>
<link rel="stylesheet" href="${cpath }/css/style.css">
</head>
<body>
	<h1>Quiz2</h1>
	<hr>
	
<section>
	<h4>Account 테이블을 전체 출력</h4>
	
	<table class="board">
		<thead>
			<tr>
				<th>IDX</th>
				<th>UserID</th>
				<th>UserPW</th>
				<th>Nick</th>
				<th>Email</th>
				<th>Join-Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>${row.userid }</td>
				<td>${fn:substring(row.userpw, 0, 6) }</td>
				<td>${row.nick }</td>
				<td>${row.email }</td>
				<td>${row.join_date }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</section>
</body>
</html>