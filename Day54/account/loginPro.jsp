<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="input" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<c:set var="user" value="${dao.selectOne(input) }" scope="session"/>
	<%-- EL은 null인 경우 출력하지 않는다 --%>
	<%-- c:set의 value에 아무것도 작성되지 않으면 attribute는 생성되지 않는다 --%>
	
	<c:set var="row" value="0"/>
	<c:set var="msg" value="'로그인 실패'"/>
	
	<c:if test="${not empty user }">
		<c:set var="row" value="1"/>
		<c:set var="msg" value="'${user.nick }님 로그인'"/>
	</c:if>
	
	<script>
		message(${msg}, ${row});
	</script>
</body>
</html>