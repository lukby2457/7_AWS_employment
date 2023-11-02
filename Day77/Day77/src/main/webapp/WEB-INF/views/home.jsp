<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
<section>
	 <h2>Hello Spring</h2>
	 
	 <c:if test="${empty user }">
	 	<h4>페이지 방문을 환영합니다</h4>
	 </c:if>
	 <c:if test="${not empty user }">
	 	<h4>${user.nick }님 환영합니다</h4>
	 </c:if>
	 
</section>

<%@ include file="footer.jsp" %>