<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.jsp</title>
<style>
table {
	border-collapse: collapse;
}
table th, td {
	border: 1px solid #aaaaaa;
	padding: 5px 10px;
}
</style>
</head>
<body>
	<h1>Model</h1>
	<hr>
	
	<h4>DB를 접근해서 데이터 처리를 하는 객체</h4>
	
	<p>${ver }</p>
	
	<table>
		<tr>
			<th>이름</th>
			<th>신장</th>
			<th>생년월일</th>
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.name }</td>
			<td>${row.height }</td>
			<td>${row.birth }</td>
		</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<table>
		<tr>
			<th>IDX</th>
			<th>부서이름</th>
			<th>부서창설일</th>
			<th>부서번호</th>
			<th>부서이메일</th>
		</tr>
		<c:forEach var="row" items="${depList }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.name }</td>
			<td>${row.dep_create }</td>
			<td>${row.phone }</td>
			<td>${row.email }</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>