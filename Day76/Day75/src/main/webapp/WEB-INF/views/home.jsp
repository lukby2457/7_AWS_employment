<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
<section>
	<ol>
		<li>/로 요청시 처리할 Controller를 작성</li>
		<li>View는 home.jsp를 사용</li>
		<li>home.jsp에서는 로또번호 한 세트 출력</li>
		<li>로또번호를 처리하는 부분은 LottoService 클래스를 작성해서 처리</li>
	</ol>
	
	<h4>${lotto }</h4>
	
	<h5>${version }</h5>
	
</section>

</body>
</html>