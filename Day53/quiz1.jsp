<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1.jsp</title>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>
	
	<%--
		이름, 나이를 입력할 form 작성
		현재 페이지에 데이터를 전송하고
		나이에 따라서 성인/미성년자를 판별해서 출력
		단, EL을 활용할 것
	 --%>
	 
	 <form>
	 	<p><input name="name" placeholder="이름" required></p>
	 	<p><input name="age" type="number" placeholder="나이" required></p>
	 	
	 	<button>전송</button>
	 </form>
	 
	 <div>
	 	<h4>이름 : ${param.name }</h4>
	 	<h4>나이 : ${param.age }</h4>
	 	<h4>${param.age >= 19 ? '성인' : '미성년자' }</h4>
	 	<%-- EL은 null을 표시하지 않는다. 따라서 null을 전달하더라도 nullpointer에러가 나지 않는다 --%>
	 </div>
	
</body>
</html>