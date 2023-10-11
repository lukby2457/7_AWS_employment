<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<jsp:useBean id="input" class="beans.AccountVO"/>
<jsp:setProperty property="*" name="input"/>

<c:set var="row" value="${accDao.insert(input) }"/>

<c:set var="msg" value="'회원가입 실패'"/>

<c:if test="${row != 0 }">
	<c:set var="msg" value="'회원가입 성공'"/>
</c:if>

<script>
	message(${row}, ${msg}, '${cpath}');
</script>

</body>
</html>