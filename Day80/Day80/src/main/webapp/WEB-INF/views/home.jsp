<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<c:set var="list" value="${map['list'] }"/>
	<c:set var="p" value="${map['p'] }"/>
	
	<table>
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td><a href="${cpath }/board/view?idx=${row.idx }">
				${row.title }
			</a></td>
			<td>${row.writer }</td>
			<td>${row.view_count }</td>
			<td>${row.write_date }</td>
		</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<div class="butPage">
		<a href="${cpath }/txTest">
			<button>tx 테스트</button>
		</a>
		
		<ul class="paging">
			<li><a href="${cpath }/1">&lt;&lt;</a></li>
			<c:if test="${p.prev }">
				<li><a href="${cpath }/${p.begin - 1 }">&lt;</a></li>
			</c:if>
			<c:forEach var="i" begin="${p.begin }" end="${p.end }">
				<li><a href="${cpath }/${i }">${i }</a></li>
			</c:forEach>
			<c:if test="${p.next }">
				<li><a href="${cpath }/${p.end + 1 }">&gt;</a></li>
			</c:if>
			<li><a href="${cpath }/${p.totalPage}">&gt;&gt;</a></li>
		</ul>
		
		<a href="${cpath }/board/write">
			<button>글작성</button>
		</a>
	</div>
	
</body>
</html>