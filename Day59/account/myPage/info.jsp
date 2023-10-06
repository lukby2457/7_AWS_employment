<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table class="boards">
	<tr>
		<th>IDX</th>
		<td>${user.idx }</td>
	</tr>
	<tr>
		<th>ID</th>
		<td>${user.userid }</td>
	</tr>
	<tr>
		<th>PW</th>
		<td><input name="userpw" type="password"></td>
	</tr>
	<tr>
		<th>Nick</th>
		<td>${user.nick }</td>
	</tr>
	<tr>
		<th>E-mail</th>
		<td><input name="email" type="email" value="${user.email }"></td>
	</tr>
	<tr>
		<th>가입일자</th>
		<td>${user.join_date }</td>
	</tr>
</table>