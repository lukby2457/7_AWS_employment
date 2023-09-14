<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h4>로그인 성공</h4>
<h4><%=login.getNick() %>님 환영합니다.</h4>

<%
	String userid = login.getUserid();
	String userpw = login.getUserpw();
	String save = (String)session.getAttribute("save");
	
	Cookie[] cks = new Cookie[] {
			new Cookie("userid", userid),
			new Cookie("userpw", userpw),
			new Cookie("save", "checked"),
	};
	
	for (int i = 0; i < cks.length; i++) {
		cks[i].setMaxAge(0);
		
		if (save != null) {
			cks[i].setMaxAge(60 * 60 * 24 * 7);
		}
		
		response.addCookie(cks[i]);
	}
%>

</body>
</html>