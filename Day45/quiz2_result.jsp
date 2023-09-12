<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2_result.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<%! 
		Account[] accs = new Account[] {
			new Account("test1", "1234", "테스트"), 
			new Account("itbank", "it", "itbank"), 
			new Account("admin", "qwe", "관리자")
		};
	%>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		String msg = "로그인 실패";	
	
		for (int i = 0; i < accs.length; i++) {
			boolean idTrue = (acc.getUserid()).equals(accs[i].getUserid());
			boolean pwTrue = (acc.getUserpw()).equals(accs[i].getUserpw());
			
			if(idTrue && pwTrue) {
				msg = accs[i].getNick() + "님 로그인";
				break;
			}
		}
	%>
	
	<h1>결과</h1>
	<hr>
	
	<h4><%=msg %></h4>
	
	<button onclick="history.back()">뒤로</button>
</body>
</html>