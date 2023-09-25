<%@page import="service.Hash"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<jsp:useBean id="input" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<c:set var="id" value="${dao.findPW(input) }"></c:set>

<article>
	<c:choose>
		<c:when test="${id != null }">
			<c:set var="newPw" value="${Hash.getPassword() }"></c:set>
			
			<h4>당신의 PW는 ${newPw } 입니다.</h4>
			
			<c:set var="row" value="${dao.updatePW(id, newPw) }"></c:set>
		</c:when>
		<c:otherwise>
			<h4>일치하는 ID나 E-mail이 존재하지 않습니다</h4>
		</c:otherwise>
	</c:choose>
	
	<a href="login.jsp"><button>login</button></a>
</article>

</body>
</html>