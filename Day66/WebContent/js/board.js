function update(idx, cpath) {
	location.href = cpath + '/update?idx=' + idx;
}

function board_delete(idx, cpath) {
	let del = confirm('글을 삭제하시겠습니까?');
	
	if(del) {
		location.href = cpath + '/delete?idx=' + idx;
	}
}