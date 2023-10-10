<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:set var="account" value="${accDao.selectAll() }"/>
<c:set var="list" value="${account['list'] }"></c:set>

<article class="board">
	<h4>실제 서비스할 페이지가 아닙니다</h4>
	<p>Account 테이블을 전체 출력해주세요 (AccountDAO를 사용)</p>
	
	<table class="boards">
		<tr>
			<th>IDX</th>
			<th>Userid</th>
			<th>Userpw</th>
			<th>Nick</th>
			<th>Email</th>
			<th>Join_Date</th>
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
	
</article>

</body>
</html>