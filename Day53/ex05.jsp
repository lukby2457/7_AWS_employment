<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05.jsp</title>
</head>
<body>
	<h1>EL - operator</h1>
	<hr>
	
	<ul>
		<li>\${10 + 3 } = ${10 + 3 }</li>
		<li>\${10 - 3 } = ${10 - 3 }</li>
		<li>\${10 * 3 } = ${10 * 3 }</li>
		<li>\${10 / 3 } = ${10 / 3 }</li>
		<li>\${10 % 3 } = ${10 % 3 }</li>
		<li>몫을 구하는 EL은 없다</li>
		<li>\${10 > 3 } = ${10 gt 3 }</li>					<%-- gt : greater than. ~보다 크다 --%>
		<li>\${10 < 3 } = ${10 lt 3 }</li>					<%-- ㅣt : less than. ~보다 작다 --%>
		<li>\${10 >= 3 } = ${10 ge 3 }</li>					<%-- ge : greater equal. ~보다 크거나 같다 --%>
		<li>\${10 <= 3 } = ${10 le 3 }</li>					<%-- le : greater equal. ~보다 작거나 같다 --%>
		<li>\${10 == 3 } = ${10 eq 3 }</li>					<%-- eq : equal. ~와 같다 --%>
		<li>\${10 != 3 } = ${10 != 3 }</li>					<%-- ne : not equla. ~와 같지 않다 (사용해도 되나 빨간색 표시) --%>
		<li>\${true && true } = ${true && true }</li>		<%-- and : 양쪽 모두 참이면 참. 기호 && 사용 권장 --%>
		<li>\${false || false } = ${flase || false }</li>	<%-- or : 양쪽 모두 거짓이면 거짓. 기호 || 사용 권장 --%>
		<li>\${!true } = ${not true }</li>					<%-- not : 참/거짓 반전. 문자 not으로 사용 권장 --%>
		<li>\${empty user } = ${empty user }</li>			<%-- empty : 해당 데이터(attribute, parameter, cookie)가 있는지 판별. 없으면 참 --%>
		<li>\${not empty cookie.age } = ${not empty cookie.age }</li>
		<li>\${4 > 0 ? '양수' : '음수' } = ${4 > 0 ? '양수' : '음수' }</li>
	</ul>
	
</body>
</html>