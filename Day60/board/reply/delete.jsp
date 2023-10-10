<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp" %>

<jsp:useBean id="rdao" class="model.ReplyDAO"/>
<c:set var="row" value="${rdao.delete(param.idx) }"/>

<c:set var="msg" value="'댓글 삭제 실패'"></c:set>

<c:if test="${row != 0 }">
	<c:set var="msg" value="'댓글 삭제 성공'"/>
</c:if>

<script>
	message(${row}, ${msg}, '${cpath}');
</script>

</body>
</html>