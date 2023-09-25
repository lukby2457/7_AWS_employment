<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<article>
	<c:set var="list" value="${dao.selectAll() }"/>
	
	<h5>Account CRUD를 모두 구현</h5>
	
	<h4></h4>
	
	<table class="accounts">
		<thead>
			<tr>
				<th>IDX</th>
				<th>Userid</th>
				<th>Userpw</th>
				<th>Nick</th>
				<th>Email</th>
				<th>Join_Date</th>
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
</article>
</body>
</html>