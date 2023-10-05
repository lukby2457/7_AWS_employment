<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp" %>

<jsp:useBean id="input" class="beans.ReplyVO"/>
<jsp:setProperty property="*" name="input"/>
<jsp:useBean id="rdao" class="model.ReplyDAO"/>

<c:set var="row" value="${rdao.insert(input) }"/>
<c:set var="msg" value="'댓글 작성 실패'"></c:set>
<c:set var="addr" value="${cpath }/board/view.jsp?idx=${input.board_idx }"/>

<c:if test="${row != 0 }">
	<c:set var="msg" value="'댓글 작성 성공'"/>
</c:if>

<script>
	message(${row}, ${msg}, '${addr}');
</script>

</body>
</html>