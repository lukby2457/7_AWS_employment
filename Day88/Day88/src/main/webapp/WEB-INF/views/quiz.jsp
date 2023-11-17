<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<h4>Board 테이블 - REST</h4>
	
	<table class="board">
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
		
		</tbody>
	</table>
	
	<ul class="page">
	<%-- 
		<li data-i="${11-1 }">&lt;</li>
		
		<c:forEach var="i" begin="1" end="10">
			<li data-i="${i }">${i }</li>
		</c:forEach>
		
		<li data-i="${10+1 }">&gt;</li>
	--%>
	</ul>
	
	<p class="btns">
		<button>GET</button>
		<button>POST</button>
		<button>PUT</button>
		<button>PATCH</button>
		<button>DELETE</button>
	</p>
	
	<div class="view"><pre></pre></div>
	
</section>

<script src="${cpath }/resources/js/quiz.js"></script>

</body>
</html>