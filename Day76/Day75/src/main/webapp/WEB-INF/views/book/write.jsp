<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form method="POST">
		<table>
			<tr>
				<th>IDX</th>
				<td><input name="idx" placeholder="IDX" value="${row.idx }"></td>
			</tr>
			<tr>
				<th>Title</th>
				<td><input name="title" placeholder="Title" value="${row.title }"></td>
			</tr>
			<tr>
				<th>Writer</th>
				<td><input name="writer" placeholder="Writer" value="${row.writer }"></td>
			</tr>
			<tr>
				<th>Publisher</th>
				<td><input name="publisher" placeholder="Publisher" value="${row.publisher }"></td>
			</tr>
			<tr>
				<th>P_Date</th>
				<td><input name="p_date" type="date" value="${row.p_date }"></td>
			</tr>
			<tr>
				<th>Price</th>
				<td><input name="price" placeholder="Price" value="${row.price }"></td>
			</tr>
			<tr>
				<th colspan="2"><button>전송</button></th>
			</tr>
		</table>
	</form>
</section>

</body>
</html>