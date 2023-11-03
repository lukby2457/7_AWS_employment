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
	</table>
</section>

<%@ include file="../footer.jsp" %>