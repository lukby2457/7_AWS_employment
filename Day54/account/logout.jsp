<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:remove var="user"/>

<c:set var="row" value="1"/>
<c:set var="msg" value="'로그아웃 되었습니다'"/>

<script>
	message(${msg}, ${row});
</script>

</body>
</html>