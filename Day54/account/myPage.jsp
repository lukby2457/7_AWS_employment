<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<article>
	<form action="update.jsp">
	<table class="accounts">
		<tr>
			<th>IDX</th>
			<td>${user.idx }</td>
		</tr>
		<tr>
			<th>Userid</th>
			<td>${user.userid }</td>
		</tr>
		<tr>
			<th>Userpw</th>
			<td><input name="userpw" type="password" placeholder="PW" required></td>
		</tr>
		<tr>
			<th>Userpw Check</th>
			<td><input name="userpw" type="password" placeholder="PW" required></td>
		</tr>
		<tr>
			<th>Nick</th>
			<td>${user.nick }</td>
		</tr>
		<tr>
			<th>Email</th>
			<td><input name="email" type="email" placeholder="Email" required value="${user.email }"></td>
		</tr>
		<tr>
			<th>Join_Date</th>
			<td>${user.join_date }</td>
		</tr>
	</table>
	
	<p class="msg"></p>
	
	<input name="idx" type="hidden" value="${user.idx }">
	
	<button>수정</button>
	<a href="delete.jsp?idx=${user.idx }"><button type="button">탈퇴</button></a>
	</form>
</article>

<script src="../js/pwCheck.js"></script>

</body>
</html>