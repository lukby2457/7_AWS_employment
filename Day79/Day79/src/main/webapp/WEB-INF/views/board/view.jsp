<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section class="board">
	<table>
		<tr>
			<td>${board.idx }. ${board.title }</td>
		</tr>
		<tr>
			<td>${board.writer } | ${board.view_count } | ${board.write_date }</td>
		</tr>
		<tr>
			<td><pre>
${board.contents }
			</pre></td>
		</tr>
		<c:if test="${board.writer == user.nick }">
		<tr>
			<td>
				<div class="myButton">
					<a href="${cpath }/board/update/${board.idx}"><button>
						수정
					</button></a>
					<a href="${cpath }/board/delete/${board.idx}"><button>
						삭제
					</button></a>
				</div>
				
			</td>
		</tr>
		</c:if>
	</table>
</section>

<%@ include file="../footer.jsp" %>