<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	<%!
		String[] ids = new String[] { "test1", "itbank", "admin" };
		String[] pws = new String[] { "1234", "it", "qwe" };
	%>
	
	<% 
		request.setCharacterEncoding("utf-8");
	
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		String puserid = "";
		
		for (int i = 0; i < ids.length; i++) {
			if (userid.equals(ids[i]) && userpw.equals(pws[i])) {
				puserid = ids[i];
				break;
			}
		}
	%>
	
	<h1>결과</h1>
	<hr>
	
	<h4>
		<%if(puserid.isEmpty()) { %>
			로그인 실패
		<% } else { %>
			<%=puserid %>님 로그인
		<% } %>
	</h4>
	
	<button onclick="history.back()">뒤로</button>
</body>
</html>