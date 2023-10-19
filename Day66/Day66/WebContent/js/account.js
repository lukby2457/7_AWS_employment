function logout(cpath) {
	let url = cpath + '/login';
	
	fetch(url, { method : 'delete'})
	.then(response => { 
		// console.log(response); 
	})
	
	// location.reload();
	
	msg(cpath, '로그아웃 되었습니다');
}

function msg(cpath, text) {
	alert(text);
	location.href = cpath;
}