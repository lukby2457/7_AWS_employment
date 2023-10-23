<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<ul>
		<li>번호 : ${acc.idx }</li>
		<li>아이디 : ${acc.userid }</li>
		<li>패스워드 : ${fn:substring(acc.userpw, 0, 12) }</li>
		<li>닉네임 : ${acc.nick }</li>
		<li>이메일 : ${acc.email }</li>
		<li>가입일자 : ${acc.join_date }</li>
	</ul>
</section>

</body>
</html>