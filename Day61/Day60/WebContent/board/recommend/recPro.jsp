<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/header.jsp" %>

	<jsp:useBean id="input" class="beans.RecommendVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<jsp:useBean id="rec" class="service.Recommend"/>
	<c:set var="row" value="${rec.recPro(input) }"/>
	<c:set var="msg" value="'추천/비추천 업데이트 실패'"/>
	
	<c:if test="${row != 0 }">
		<c:set var="msg" value="'추천/비추천 업데이트성공'"/>
	</c:if>
	
	<script>
		message(${row}, ${msg}, '${cpath}/board/view.jsp?idx=${input.board_idx}');
	</script>
</body>
</html>