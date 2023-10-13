<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<c:set var="row" value="${dao.selectOne(param.idx) }"/>

<section>
	<table class="view">
		<tr>
			<th colspan="4">${row.idx}.${row.title }</th>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${row.writer }</td>
			<th>작성일</th>
			<td>${row.write_date }</td>
		</tr>
		<tr>
			<td colspan="4">
				<div class="contents">
					<c:if test="${row.img_path != 'image/default.png' }">
						<img src="${row.img_path }" width="650px" height="500px">
					</c:if>
					<pre>
${row.contents }
					</pre>
				</div>
			</td>
		</tr>
		<tr>
			<td></td>
		</tr>
	</table>
	
</section>

</body>
</html>