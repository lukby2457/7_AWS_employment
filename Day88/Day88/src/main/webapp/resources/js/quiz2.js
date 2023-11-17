let url = 'account';
let userid = document.getElementsByName('userid')[0];
let nick = document.getElementsByName('nick')[0];

userid.onblur = () => {
    //alert('작성된 id = ' + userid.value);	// input은 innerHTML이 아닌 value의 값을 들고와야 값이 가져와진다
    
    let data = {
    	'userid': userid.value
    }
    
    fetch(url, { 
    	method: 'POST',
    	headers : { 'Content-Type': 'application/json' },
    	body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(data => {
    	if(data == 1) {
    		alert('이미 존재하는 계정입니다');
    		userid.value = '';
    		userid.focus();
    	}
    })
};

nick.onblur = () => {
	let data = {
		'nick': nick.value
	}
	
	fetch(url + "/nick", {
		method: 'POST',
		headers : { 'Content-Type': 'application/json' },
    	body: JSON.stringify(data)
	})
	.then(response => response.json())
	.then(data => {
		if(data == 1) {
			alert('이미 존재하는 닉네임입니다');
			nick.value = '';
			nick.focus();
		}
	})
}