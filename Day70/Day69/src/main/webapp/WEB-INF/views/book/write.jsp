<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>
</head>
<body>
	<h1>write</h1>
	<hr>
	
	<form method="POST">
		<p><input name="idx" type="number" placeholder="등록번호" required value="${data.idx }"></p>
		<p><input name="title" placeholder="책제목" required value="${data.title }"></p>
		<p><input name="writer" placeholder="저자" required value="${data.writer }"></p>
		<p><input name="publisher" placeholder="출판사" required value="${data.publisher }"></p>
		<p><input name="p_date" type="date" required value="${data.p_date }"></p>
		<p><input name="price" type="number" placeholder="가격" required value="${data.price }"></p>
		
		<button>작성</button>
	</form>

</body>
</html>