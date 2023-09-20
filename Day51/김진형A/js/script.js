function up() {
    let pop = document.querySelector('.popUp');
    pop.onclick = () => {
        let newWin = open(
            'popUp.html',
            '_blank', 
            'top=100, left=100, width=450, height=600')
    }
}
function btnClose() {
    let btn = document.querySelector('.textBtn');
    btn.onclick = () => {
        close();
    }
}