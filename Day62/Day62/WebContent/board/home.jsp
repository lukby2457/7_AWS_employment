<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section class="board">
	<c:forEach var="i" begin="1" end="9">
	<article class="thumbnail">
		<div><img src="image/Hello.png" width="100%" height="120px"></div>
		<p>
			게시글 제목<br>
			닉네임
		</p>
	</article>
	</c:forEach>
</section>

</body>
</html>