let userpw = document.getElementsByName('userpw');

userpw[1].onblur = () => {
	let msg = document.querySelector('.msg');
	
	if(userpw[0].value != userpw[1].value) {
		msg.innerHTML = '패스워드가 일치하지 않습니다';
		msg.style.color = 'red';
		
		userpw[0].focus();
		userpw[1].value = '';
	}
	else {
		msg.innerHTML = '패스워드가 일치합니다';
		msg.style.color = 'blue';
	}
}

function check(idx) {
	let ok = confirm('삭제 하시겠습니까?');
	
	if(ok) {
		location.href = 'delete.jsp?idx=' + idx;
	}
}