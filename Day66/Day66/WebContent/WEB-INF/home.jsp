<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="map" value="${map }"/>
<c:set var="list" value="${map['list'] }"/>
<c:set var="paging" value="${map['paging'] }"/>
<c:set var="endPlus" value="${paging.end + paging.perPage }"/>
<c:set var="endPage" value="${endPlus > paging.totalPage ? paging.totalPage : endPlus }"></c:set>

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
	
	<%-- Paging attribute --%>
	<c:set var="path" value="${cpath }/home?page="/>
	
	<ul class="menu page">
		<c:if test="${paging.prev }">
			<li><a href="${path }${paging.begin - 1 }">이전</a></li>
		</c:if>
		
		<c:forEach var="i" begin="${paging.begin }" end="${paging.end }">
			<li><a href="${path }${i }">${i }</a></li>
		</c:forEach>
		
		<c:if test="${paging.next }">
			<li><a href="${path }${endPage }">다음</a></li>
		</c:if>
	</ul>
</section>

<%@ include file="footer.jsp" %>