<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%
	Cookie[] cks = request.getCookies();
	String id = "";
	String save = "";
	
	if(cks != null) {
		for (int i = 0; i < cks.length; i++) {
			switch(cks[i].getName()) {
			case "idSave":
				id = cks[i].getValue();
				break;
			case "save":
				save = cks[i].getValue();
				break;
			}
		}
	}
	
%>

<article>
	<form action="loginPro.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required value="<%=id %>"></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<p>
			<input id="save" name="idSave" type="checkbox" value="yes" <%=save %>>
			<label for="save">ID저장</label>
		</p>
		
		<button>login</button>
		<a href="find.jsp">
			<button type="button">ID/PW find</button>
		</a>
	</form>
</article>

</body>
</html>