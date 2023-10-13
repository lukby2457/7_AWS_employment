<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="list" value="${dao.selectAll() }"/>

<section class="board">
	<c:forEach var="row" items="${list }">
	<article class="thumbnail" onclick="view(${row.idx })">
		<div><img src="${row.img_path }" width="100%" height="120px"></div>
		<p>
			${row.title }<br>
			${row.writer }
		</p>
	</article>
	</c:forEach>
</section>

<script>
	function view(idx) {
		// alert(idx + '번 클릭');
		location.href = 'view.jsp?idx=' + idx;
	}
</script>

</body>
</html>