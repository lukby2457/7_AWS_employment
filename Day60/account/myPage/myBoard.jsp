<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="page" value="${empty param.page ? 1 : param.page }"/>

<jsp:useBean id="dao" class="model.BoardDAO"/>
<c:set var="map" value="${dao.selectAll(page, 'writer', user.nick, 'idx') }"/>
<c:set var="list" value="${map['list'] }"/>
<c:set var="paging" value="${map['paging'] }"/>

<table class="boards">
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>조회수</th>
		<th>작성일</th>
	</tr>
	<c:forEach var="row" items="${list }">
	<tr>
		<td>${row.idx }</td>
		<td>${row.title }</td>
		<td>${row.writer }</td>
		<td>${row.view_count }</td>
		<td>${row.write_date }</td>
	</tr>
	</c:forEach>
</table>

<ul class="page">
	<c:if test="${paging.prev }">
		<li><a href="myPage.jsp?show=myBoard&page=${paging.begin - 1 }">이전</a></li>
	</c:if>

	<c:forEach var="i" begin="${paging.begin }" end="${paging.end }">
	<li><a href="myPage.jsp?show=myBoard&page=${i}">${i }</a></li>
	</c:forEach>
	
	<c:if test="${paging.next }">
		<li><a href="myPage.jsp?show=myBoard&page=${paging.end + 1 }">다음</a></li>
	</c:if>
</ul>

<p>
	<span>
		총 ${paging.totalBoard }개의 글
		(${paging.totalPage })페이지
	</span>
</p>
