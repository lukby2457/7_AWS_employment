<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<jsp:useBean id="input" class="beans.AccountVO"/>
<jsp:setProperty property="*" name="input"/>

<c:set var="user" value="${accDao.selectOne(input) }" scope="session"/>
<c:set var="row" value="${empty user ? 0 : 1 }"></c:set>
<%-- 로그인 실패하면 EL에서 null을 받고  value에서 null이면 빈 값이어서 user가 만들어지지 않는다--%>

<%-- ${pageContext.request.method }  <%=request.getMethod() %>와 동일 --%>

<c:set var="msg" value="'로그인 실패'"/>

<c:if test="${row != 0 }">
	<c:set var="msg" value="'로그인 성공'"/>
</c:if>

<script>
	message(${row}, ${msg}, '${cpath}');
</script>

</body>
</html>