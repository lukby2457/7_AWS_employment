function message(row, msg) {
	if (row = 0) {
		alert(`${msg} 실패`);
		history.back();
	}
	else {
		alert(`${msg} 성공`);
		location.href = 'home.jsp';
	}
}