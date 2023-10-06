<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<jsp:useBean id="input" class="beans.BoardVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<c:set var="row" value="${dao.insert(input) }"/>
	<c:set var="msg" value="'작성 실패'"/>
	
	<c:if test="${row != 0 }">
		<c:set var="msg" value="'작성 성공'"/>
	</c:if>
	
	<script>
		message(${row}, ${msg}, '${cpath}');
	</script>

</body>
</html>