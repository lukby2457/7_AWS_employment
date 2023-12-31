<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz1.jsp</title>
<style>
	table{
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px
	}
</style>
</head>
<body>
	<h1>Quiz</h1>
	<hr>
	
	<ul>
		<li>JSP로 풀어주세요~</li>
		<li>반복을 활용해서 구구단 2단을 출력해 주세요</li>
		<li>단, 테이블로 출력하고 스타일로 테두리도 출력</li>
		<li>테이블 제일 위의 행에는 현재 시간을 출력해 주세요</li>
	</ul>
	
	<% 
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String time = sdf.format(date);
	%>
	
	<table>
		<thead>
			<tr>
				<th colspan="2"><%=time %></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>구구단</th>
				<th>결과</th>
			</tr>
			<%for(int i = 1; i <= 9; i++) { %>
				<tr>
					<td>2 * <%=i %></td>
					<td><%=2 * i %></td>
				</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>