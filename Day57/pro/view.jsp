<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<c:set var="row" value="${dao.selectOne(param.idx) }"/>
<c:set var="rps" value="${dao.selectReplyAll(param.idx) }"/>


<article class="board">
	<table class="boards">
		<tr>
			<th colspan="6">${row.idx }. ${row.title }</th>
		</tr>
		<tr>
			<th>작성자</th>
			<th>${row.writer }</th>
			<th>조회수</th>
			<th>${row.view_count }</th>
			<th>작성일</th>
			<th>${row.write_date }</th>
		</tr>
		<tr>
			<td colspan="6"><pre>${row.contents }</pre></td>
		</tr>
	</table>
	
	<br><hr><br>
	
	
	<form class="reply">
		<input name="nick" placeholder="닉네임(필수)" required>
		
		<section>
			<textarea name="contents" placeholder="바른말을 사용합니다"></textarea>
			<button>작성</button>
		</section>
	</form>

	<c:forEach var="rp" items="${rps }">
<pre>
${rp.writer }
${rp.contents }
${rp.write_date }
</pre><hr>
	</c:forEach>



	
</article>

</body>
</html>