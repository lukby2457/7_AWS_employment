<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2.jsp</title>
</head>
<body>
	<%--
		quiz2.jsp			두 정수를 입력 받을 form을 작성
							작성한 데이터는 quiz2_result.jsp로 전송
							단, 요청 메서드는 GET으로
		
		quiz2_result.jsp	전달된 파라미터를 받아서 처리할 페이지
							전달된 두 정수의 합계를 출력
	 --%>
	
	<h1>Quiz2</h1>
	<hr>
	
	<form action="quiz2_result.jsp">
		<p><input name="n1" type="number" placeholder="첫번째 정수" required></p>
		<p><input name="n2" type="number" placeholder="두번째 정수" required></p>
		
		<button>전송</button>
	</form>
	
</body>
</html>