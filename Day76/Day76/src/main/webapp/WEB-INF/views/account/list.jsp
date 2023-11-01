<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h4 class="debug"><marQuee>디버그 페이지 입니다 - 배포시 꼭! 제거</marQuee></h4>
	
	<table class="accountBoard">
		<tr>
			<th>idx</th>
			<th>userid</th>
			<th>userpw</th>
			<th>nick</th>
			<th>email</th>
			<th>join_date</th>
		</tr>
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
	</table>
	
</section>

<%@ include file="../footer.jsp"%>