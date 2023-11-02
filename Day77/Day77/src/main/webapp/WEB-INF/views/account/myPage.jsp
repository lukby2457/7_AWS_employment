<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section class="accountBoard half">
	<form action="update/${user.idx }" method="POST">
		<table>
			<tr>
				<th>회원번호</th>
				<td>${user.idx }</td>
			</tr>
			<tr>
				<th>ID</th>
				<td>${user.userid }</td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input name="userpw" type="password" required></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td>${user.nick }</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input name="email" type="email" required value="${user.email }"></td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td>${user.join_date }</td>
			</tr>
			<tr>
				<td colspan="2">
					<div class="myButton">
						<button>수정</button>
						<button type="button" onclick="isDel(${user.idx }, '${cpath }')">탈퇴</button>
					</div>
				</td>
			</tr>
		</table>
	</form>
</section>

<script>
function isDel(idx, cpath) {
	let con = confirm("탈퇴 하시겠습니까?");
	if(con == true) {
		location.href = cpath + '/account/delete?idx=' + idx;
	}
}
</script>

<%@ include file="../footer.jsp" %>