<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<article class="accFind">
		<fieldset>
			<legend>ID 찾기</legend>
			
			<form action="findID.jsp" method="POST">
				<p><input name="email" type="email" placeholder="이메일" required></p>
				
				<button>find</button>
			</form>
		</fieldset>
		
		<fieldset>
			<legend>PW 찾기</legend>
			
			<form action="findPW.jsp" method="POST">
				<p><input name="userid" placeholder="ID" required></p>
				<p><input name="email" type="email" placeholder="이메일" required></p>
				
				<button>find</button>
			</form>
		</fieldset>
	</article>

</body>
</html>