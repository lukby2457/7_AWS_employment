<%@page import="model.PersonDAO"%>
<%@page import="dto.PersonVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% 
		String name = request.getParameter("name");
		String pname = name;
	
		PersonDAO dao = new PersonDAO();	
	
		List<PersonVO> list = dao.selectOne(name);
		PersonVO row = list.get(0);
	%>

	<form action="ex02_updatePro.jsp" method="POST">
		<p>
			<label for="name">이름</label>
			<input id="name" name="name" required value="<%=row.getName() %>">
		</p>
		<p>
			<label for="height">신장</label>
			<input id="height" name="height" type="number" step="0.1" required value="<%=row.getHeight() %>">
		</p>
		<p>
			<label for="birth">생년월일</label>
			<input id="birth" name="birth" type="date" required value="<%=row.getBirth() %>">
		</p>
		
		<input type="hidden" name="findName" value="<%=pname %>">
		
		<button>전송</button>
	</form>
</body>
</html>