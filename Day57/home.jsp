<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<c:set var="page" value="${empty param.page ? 1 : param.page }"/>
	<c:set var="type" value="${empty param.type ? 'title' : param.type }"/>
	<c:set var="search" value="${empty param.search ? '' : param.search }"/>
	<c:set var="map" value="${dao.selectAll(page, type, search) }"/>
	<c:set var="boards" value="${map['list'] }"/>	<%-- map의 list의 list 들고오기 --%>
	<c:set var="paging" value="${map['paging'] }"/>

	
<article class="board">
	<h4>오늘 날짜 : ${dao.test() }, ${page }, ${type }, ${search }</h4>
	
	<table class="boards">
		<thead>
			<tr>
				<th>No</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성날짜</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${boards }">
			<tr>
				<td>${row.idx }</td>
				<td><a href="${cpath }/board/view.jsp?idx=${row.idx }">
					${row.title }
				</a></td>
				<td>${row.writer }</td>
				<td>${row.view_count }</td>
				<td>${row.write_date }</td>
				<td><a href="${cpath }/board/update.jsp?idx=${row.idx }">클릭</a></td>
				<td onclick="isDel(${row.idx}, '${cpath }')">클릭</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<ul class="page">
		<c:set var="isSearch" value="type=${type}&search=${search}"/>
	
		<c:if test="${paging.prev }">
			<li><a href="${cpath }/home.jsp?page=${paging.begin - 1 }&${isSearch}">이전</a></li>
		</c:if>
	
		<c:forEach var="i" begin="${paging.begin }" end="${paging.end }">
		<li><a href="${cpath }/home.jsp?page=${i }&${isSearch}">${i }</a></li>
		</c:forEach>
		
		<c:if test="${paging.next }">
			<li><a href="${cpath }/home.jsp?page=${paging.end + 1 }&${isSearch}">다음</a></li>
		</c:if>
	</ul>
	
	<p><a href="${cpath }/board/write.jsp"><button>글작성</button></a></p>
	
	<div>
		<form>
			<select name="type">
				<option value="title">제목</option>
				<option value="writer">작성자</option>
				<option value="contents">내용</option>
			</select>
				
			<input name="search">
			
			<button>검색</button>
		</form>
	</div>
	
	<script src="${cpath }/js/isDel.js"></script>
</article>
	
</body>
</html>