<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>파일 목록</h4>
	
	<table>
		<tr>
			<th>IDX</th>
			<th>File Name</th>
			<th>Uploader</th>
			<th>Memo</th>
			<th>Upload_Date</th>
			<th>수정</th>
			<th>삭제</th>	
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td><a href="${cpath }/files/${row.name }" download>
				${row.name }
			</a></td>
			<td>${row.uploader }</td>
			<td>${row.memo }</td>
			<td>${row.upload_date }</td>
			<td onclick="isUpdate('${cpath }', ${row.idx })">클릭</td>
			<td><a href="${cpath }/file/delete/${row.idx }">클릭</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<hr>
	
	<h4>업로드</h4>

	<form method="post" enctype="multipart/form-data">
		<p><input name="uploader" placeholder="업로더"></p>
		<p><input name="memo" placeholder="메모"></p>
		<p><input name="upload" type="file" required></p>
		
		<button>전송</button>
	</form>
	
	<script>
		function isUpdate(cpath, idx) {
			let name = prompt("변경할 이름을 입력해 주세요");
			
			location.href = cpath + '/file/update?name=' + name + '&idx=' + idx;
		}
	</script>
	
</body>
</html>