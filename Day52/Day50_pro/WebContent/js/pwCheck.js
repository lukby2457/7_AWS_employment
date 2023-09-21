// 패스워드 체크
let userpw = document.getElementsByName('userpw');

userpw[1].onblur = () => {
	let msg = document.querySelector('.msg');
	
	if (userpw[0].value == userpw[1].value) {
		msg.innerHTML = '패스워드 일치';
	}
	else {
		msg.innerHTML = '패스워드가 불일치';
		userpw[1].value = '';
		userpw[0].focus();
	}
}


// 탈퇴 확인
function delCheck(idx) {
	let ok = confirm('삭제 하시겠습니까?');
	
	if (ok) {
		location.href = 'delete.jsp?idx=' + idx;
	}
}