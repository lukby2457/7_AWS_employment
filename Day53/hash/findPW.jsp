<%@page import="service.NewPw"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<jsp:useBean id="find" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="find"/>
	
	<%
		AccountVO userpw = dao.findPW(find);
		String msg = "";
		
		if (userpw != null) {
			String newPw = NewPw.getPassword();
			
			msg = "당신의 임시PW는 " + newPw + "입니다.";
			
			String hash = NewPw.getHash(newPw);
			
			userpw.setUserpw(hash);
			
			int row = dao.update(userpw);
		}
		else {
			msg = "일치하는 ID나 E-mail이 존재하지 않습니다";
		}
	%>
	
	<article>
		
		<h4><%=msg %></h4>
		
		<a href="login.jsp">
			<button type="button">login</button>
		</a>
	</article>

</body>
</html>