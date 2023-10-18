<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<jsp:useBean id="dao" class="model.BoardDAO"/>
<c:set var="board" value="${result }"/>

<script src="${cpath }/js/board.js"></script>

<section>
	<table class="view">
		<tr>
			<th colspan="6">${board.idx }. ${board.title }</th>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
			<th>조회수</th>
			<td>${board.view_count }</td>
			<th>작성일</th>
			<td>${board.write_date }</td>
		</tr>
		<tr>
			<td colspan="6"><pre>${board.contents }</pre></td>
		</tr>
	</table>
	
	<c:if test="${user.nick.equals(board.writer) }">
		<button onclick="update(${board.idx }, '${cpath }')">수정</button>
		<button onclick="board_delete(${board.idx }, '${cpath }')">삭제</button>
	</c:if>
</section>

<%@ include file="../footer.jsp"%>