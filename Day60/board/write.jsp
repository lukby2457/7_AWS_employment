<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<c:set var="login" value="${empty user ? 0 : 1 }"/>
<c:if test="${login == 0 }">
	<c:redirect url="/account/login.jsp"/>
</c:if>


<article class="board">
	<form action="writePro.jsp" method="POST"><%-- 항상 같은 페이지에 있을거기 때문에 cpath를 사용하지 않아도 된다 --%>
		<table class="boards">
		<tr>
			<th>제목</th>
			<td><input name="title" placeholder="제목" required></td>
		</tr>
		<tr>
			<td colspan="2"><textarea name="contents" rows="9" cols="20"></textarea></td>
		</tr>
	</table>
	
	<br>
	
	<input name="writer" type="hidden" value="${user.nick }">
		
	<button>작성</button>
	</form>
</article>

</body>
</html>