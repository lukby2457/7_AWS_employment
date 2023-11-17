// 페이지 접근시 and GET 호출시 사용할 함수
let reqPage;
function list(reqPage) {
	fetch(url + `?reqPage=${reqPage}`, { method: 'GET' })
	.then(response => response.json())
	.then(data => {
		dt = data;
		let tr;
		
		let list = data.list;
		let p = data.p;

		board.innerHTML = '';

		// 게시글
		for (let i = 0; i < p.perCount; i++) {
			tr = document.createElement('tr');

			tr.innerHTML = 
				'<td>' + list[i].idx + '</td>' + 
				`<td data-idx="${list[i].idx}">` + list[i].title + '</td>' + 
				'<td>' + list[i].writer + '</td>' + 
				'<td>' + list[i].view_count + '</td>' + 
				'<td>' + list[i].write_date + '</td>'; 

			board.appendChild(tr);
		}
		
		// 페이지 번호
		let page = document.querySelectorAll('.page')[0];
		page.innerHTML = '';
		
		if(p.prev) {
			page.appendChild(getLi('<', p.begin - 1));
		}
		
		for (let i = p.begin; i <= p.end; i++) {
			page.appendChild(getLi(i, i));
		}
		
		if(p.next) {
			page.appendChild(getLi('>', p.end + 1));
		}
	})
}

function getLi(msg, data) {
	let li = document.createElement('li');
	li.innerHTML = msg;
	li.setAttribute('data-i', data);
	
	return li;
}

let btns = document.querySelectorAll('.btns > button');
let board = document.querySelectorAll('.board > tbody')[0];
const url = 'board';
var dt;

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

//페이징
let page = document.querySelectorAll('.page')[0];
var test;

page.onclick = (event) => { 
	let tar = event.target;
//	test = tar;
	
	if (tar.tagName == 'LI') {
//		alert(tar.tagName + ' : ' + tar.getAttribute('data-i'));
		list(tar.getAttribute('data-i'));
	}
}
