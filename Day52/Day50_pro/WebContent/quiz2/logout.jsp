<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% session.removeAttribute("user"); %>

	<script>
		message('로그아웃 되었습니다', 1);
	</script>
</body>
</html>