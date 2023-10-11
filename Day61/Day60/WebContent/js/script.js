function goUpdate(idx, cpath) {
	location.href = cpath + '/board/update.jsp?idx=' + idx;
}

function isDel(idx, cpath) {
	let del = confirm(idx + '번 글 삭제?');
	
	if (del) {
		location.href = cpath + '/board/delete.jsp?idx=' + idx;
	}
}

function message(row, msg, cpath) {
	if (row == 0) {
		alert(msg);
		history.back();
	}
	else {
		alert(msg);
		location.href = cpath;
	}
}