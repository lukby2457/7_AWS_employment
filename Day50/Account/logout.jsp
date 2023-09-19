<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% session.removeAttribute("user"); %>
	
	<script>
		alert("로그아웃 되었습니다");
		location.href = "home.jsp";
	</script>
	
	<%--
		일반 stmt로 로그인을 구현하면 sql구문이 문자열로 전송하게 된다
		성능이 떨어질 뿐 아니라 
		sql injection이 발생해서 의도하지 않은 로그인이 발생하게 된다 ('-- 삽입)
	 --%>

</body>
</html>