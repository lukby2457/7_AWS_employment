<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<article>
	<form action="signUpPro.jsp">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="userpw" type="password" placeholder="PW check" required></p>
		<p><input name="nick" placeholder="Nick" required></p>
		<p><input name="email" type="email" placeholder="Email" required></p>
		
		<button>signUp</button>
	</form>
</article>

<p class="msg"></p>

<script>
	let userpw = document.getElementsByName('userpw');
	
	userpw[1].onblur = () => {
		let msg = document.querySelector('.msg');
		
		if(userpw[0].value != userpw[1].value) {
			msg.innerHTML = '패스워드가 일치하지 않습니다';
			msg.style.color = 'red';
			
			userpw[0].focus();
			userpw[1].value = '';
		}
		else {
			msg.innerHTML = '패스워드가 일치합니다';
			msg.style.color = 'blue';
		}
	}
</script>

</body>
</html>