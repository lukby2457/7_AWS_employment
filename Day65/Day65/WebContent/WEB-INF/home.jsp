<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="map" value="${map }"/>
<c:set var="list" value="${map['list'] }"/>

<section class="board">
	<table class="boards">
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>
					<a href="${cpath }/board?idx=${row.idx}">
						${row.title }
					</a>
				</td>
				<td>${row.writer }</td>
				<td>${row.view_count }</td>
				<td>${row.write_date }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<p><a href="${cpath }/write"><button >작성</button></a></p>
</section>

<%@ include file="footer.jsp" %>