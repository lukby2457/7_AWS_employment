<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<table class="board">
		<tr>
			<th>${form.idx }. ${form.title }</th>
		</tr>
		<tr>
			<th>${form.writer } | ${form.view_count } | ${form.write_date }</th>
		</tr>
		<tr>
			<td>
				<c:if test="${not empty form.img }">
				<p><img src="${cpath }/img/${form.idx }/${form.img }" class="viewImage"></p>
				</c:if>
				<pre>
${form.contents }
				</pre>
			</td>
		</tr>
	</table>
	
	<div>
		<a href="${cpath }/board/update/${form.idx }"><button>
			수정
		</button></a>
		<a href="${cpath }/board/delete/${form.idx }"><button>
			삭제
		</button></a>
	</div>

</body>
</html>