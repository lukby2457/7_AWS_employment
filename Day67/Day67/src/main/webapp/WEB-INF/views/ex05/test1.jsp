<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h4>ex05 RequestMapping</h4>
	
	<form method="POST">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="age" type="number" placeholder="나이" required></p>
	
		<button>전송</button>
	</form>
	
</section>

</body>
</html>