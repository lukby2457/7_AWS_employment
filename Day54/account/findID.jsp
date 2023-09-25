<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<jsp:useBean id="input" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<c:set var="ids" value="${dao.findID(input) }"/>

<article>
	<c:forEach var="row" items="${ids }">
		<h4>당신의 ID는 ${row.userid } 입니다.</h4>
	</c:forEach>
	
	<a href="login.jsp"><button>login</button></a>
</article>

</body>
</html>