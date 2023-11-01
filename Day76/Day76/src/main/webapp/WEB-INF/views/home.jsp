<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
<section>
	 <h2>Hello Spring</h2>
	 
	 <ul>
	 	<li>${user.userid }</li>
	 	<li>${user.nick }</li>
	 	<li>${user.email }</li>
	 </ul>
	 
	 <h4>로그인 시 회원가입 -> 닉네임, 로그인 -> 로그아웃</h4>
</section>

<%@ include file="footer.jsp" %>