<%@page import="java.sql.Date"%>
<%@page import="dto.PersonVO"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>

	<jsp:useBean id="chgPer" class="dto.PersonVO"/>
	<jsp:setProperty property="*" name="chgPer"/>

	<%
		String birth = request.getParameter("birth");
		chgPer.setBirth(birth);	
	
		String pname = request.getParameter("findName");
		
		PersonDAO dao = new PersonDAO();
		int row = dao.update(chgPer, pname);
	%>
	
	<script>
	 	let row = <%=row %>;
	 
	 	if (row == 0) {
	 		alert("수정 실패");
	 		history.back();
	 	}
	 	else {
	 		alert("수정 성공");
	 		location.href = "ex02.jsp";
	 	}
	 </script>

</body>
</html>