// 페이지 접근시 and GET 호출시 사용할 함수
function list(reqPage) {
	fetch(url + `?reqPage=${reqPage}`, { method: 'GET' })
	.then(response => response.json())
	.then(data => {
		let tr;

		board.innerHTML = '';

		for (let i = 0; i < data.length; i++) {
			tr = document.createElement('tr');

			tr.innerHTML = 
				'<td>' + data[i].idx + '</td>' + 
				`<td data-idx="${data[i].idx}">` + data[i].title + '</td>' + 
				'<td>' + data[i].writer + '</td>' + 
				'<td>' + data[i].view_count + '</td>' + 
				'<td>' + data[i].write_date + '</td>'; 

			board.appendChild(tr);
		}
	})
}

let btns = document.querySelectorAll('.btns > button');
let board = document.querySelectorAll('.board > tbody')[0];
const url = 'board';

// 페이지 접근시 바로 출력
list(1);

btns[0].onclick = () => list(1);

btns[1].onclick = () => {
	let data = {
		title: 'js 작성',
		contents: 'javascript에서 작성되었습니다',
		writer: '테스트2'
	};

	fetch(url, { 
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(data)
	})
	.then(response => response.json())
	.then(data => {
		if (data != 0) {
			btns[0].click()
		}
	})
};

btns[2].onclick = () => {
	let int = prompt('제목, 작성자를 고정된 구문으로 수정할 idx를 정수로 입력하세요')
	
	let data = {
		idx: int,
		title: 'js 수정',
		contents: 'javascript에서 작성되었습니다',
		writer: '테스트1'
	};

	fetch(url, { 
		method: 'PUT',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(data)
	})
	.then(response => response.json())
	.then(data => {
		if (data != 0) {
			btns[0].click()
		}
	})
};

btns[3].onclick = () => {
	let int = prompt('제목을 고정된 구문으로 변경할 idx를 정수로 입력하세요')
	
	let data = {
		idx: int,
		title: 'js patch 수정'
	};

	fetch(url, { 
		method: 'PATCH',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(data)
	})
	.then(response => response.json())
	.then(data => {
		if (data != 0) {
			btns[0].click()
		}
	})
};

btns[4].onclick = () => {
	let int = prompt('삭제할 idx를 정수로 입력하세요')
	
	let data = {
		idx: int
	}

	fetch(url, { 
		method: 'DELETE',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(data)
	})
	.then(response => response.json())
	.then(data => {
		if (data != 0) {
			btns[0].click()
		}
	})
};

// 게시글 제목 클릭시 글 내용 가져오기
let table = document.querySelectorAll('.board')[0];

table.onclick = (event) => {
	let tar = event.target;
	
	console.log(tar.getAttribute('data-idx'))

	if(tar.tagName == 'TD') {
		let idx = tar.getAttribute('data-idx');
		idx = Number(idx);

		if (idx != 0) {
			fetch(url + '/' + idx, { method: 'GET' })
			.then(response => response.json())
			.then(data => {
				let view = document.querySelectorAll('.view > pre')[0];
				
				view.innerHTML = data.contents;
				
				console.log(pre);
			})
		}
	}
};

// 페이징
let page = document.querySelectorAll('.page')[0];
let reqPage;

page.onclick = (event) => {
	let tar = event.target;

	if(tar.tagName == 'LI') {
		reqPage = tar.innerHTML;
	}
};
