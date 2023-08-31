let per = {
    name : "홍길동",
    age : 23,

    show : function() {
        // 이름 나이를 문자열로 반환
        let msg = `${this.name} : ${this.age}세`;
        return msg;
    },

    eat : function(food) {
        // 'name'이 'food'를 먹는다를 문자열로 반환
        let msg = `${this.name}(이)가 ${food}(을)를 먹는다`;
        return msg;
    }
}