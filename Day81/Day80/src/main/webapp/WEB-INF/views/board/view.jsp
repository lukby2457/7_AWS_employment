<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	
	<table>
		<tr>
			<th>${row.idx }. ${row.title }</th>
		</tr>
		<tr>
			<td>${row.writer } | ${row.view_count } | ${row.write_date }</td>
		</tr>
		<tr>
			<td><pre>
${row.contents }
			</pre></td>
		</tr>
	</table>
	
	<c:forEach var="rep" items="${rps }">
	<hr>
	
	<pre>
${rep.nick }
${rep.write_date }
${rep.contents }
	</pre>
	</c:forEach>
	
	<c:if test="${empty rps }">
	<br>
	</c:if>
	
	<button onclick="history.back()">뒤로</button>
	
</body>
</html>