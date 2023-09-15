<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_insertPro.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>

	<jsp:useBean id="newPer" class="dto.PersonVO"/>
	<jsp:setProperty property="*" name="newPer"/>
	
	<%
		String birth = request.getParameter("birth");
		newPer.setBirth(birth);
		
		PersonDAO dao = new PersonDAO();
		int row = dao.insert(newPer);
	%>
	
	<!-- 
	<ul>
		<li><%=newPer.getName() %></li>
		<li><%=newPer.getHeight() %></li>
		<li><%=newPer.getBirth() %></li>
	</ul>
	 -->
	 
	 <script>
	 	let row = <%=row %>;
	 
	 	if (row == 0) {
	 		alert("삽입을 실패하였습니다");
	 		history.back();
	 	}
	 	else {
	 		alert("삽입에 성공하였습니다");
	 		location.href = "ex02.jsp";
	 	}
	 </script>
</body>
</html>