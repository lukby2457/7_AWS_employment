<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1.jsp</title>
</head>
<body>
	<%-- 
		quiz1.jsp			id/pw를 입력 받을 form을 작성
							입력한 데이터는 quiz1_result.jsp로 전송
							단, POST로 전송
						
		quiz1_result.jsp	선언부에 Account 클래스로 계정을 3개 정도 생성
							전달 받은 데이터와 일치하는 계정 정보가 있으면
							quiz_success.jsp로 리다이렉트
							일치하는 정보가 없으면
							quiz_fail.jsp로 리다이렉트
		
		Account.java		계정 정보를 저장할 Java Beans
							필드는 : userid, userpw
							
		quiz_success.jsp	로그인 성공을 출력 (※ id는 출력할 수 없음)
		quiz_fail.jsp		로그인 실패를 출력 (※ id는 출력할 수 없음)
	--%>
	
	<h1>로그인</h1>
	<hr>
	
	<form action="quiz1_result.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		 <button>전송</button>
	</form>
	
</body>
</html>