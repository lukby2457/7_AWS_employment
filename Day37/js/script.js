let li = document.getElementsByTagName('li');
li[0].innerHTML = 'Test 입니다~';

// alert('hello') - 잘 불러왔나 디버그

let sum = 0;

for(let i = 1; i <= 5; i++) {
    sum += i;
}

li[1].innerHTML = `1 ~ 5 합계 : ${sum}`;