<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
<style>
	table {
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<h1>파일 업로드</h1>
	<hr>
	
	<form action="ex01_result.jsp" method="post" enctype="multipart/form-data" onsubmit="return test()">
		<p><input name="name" placeholder="파일명"></p>
		<p><input name="upload" type="file" accept="image/*" required></p>
		
		<button>업로드</button>
	</form>
	
	<%-- 파일 목록 테이블로 출력 --%>
	
	<hr>
	
	<%
		String location = pageContext.getServletContext().getRealPath("/uploadEx");
		File dir = new File(location);
		pageContext.setAttribute("list", dir.list());
	%>
	
	<table>
		<tr>
			<th>파일명</th>
			<th>이름 변경</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="f" items="${list }">
		<tr>
			<td><a href="uploadEx/${f }" download>${f }</a></td>
			<td><a href="ex01_update.jsp?fname=${f }">클릭</a></td>
			<td><a href="ex01_delete.jsp?fname=${f }">클릭</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<script>
	//document.querySelectorAll('input')[1].accept로 찾고 onsubmit을 form에 걸고 타입이 맞지 않으면 경고창을 띄울 수 있다
	function test() {
		alert('제출을 누름');
		
		// return false;
		// onsubmit에 false가 반환되면 제출이 취소됨
	}
	</script>
	
</body>
</html>