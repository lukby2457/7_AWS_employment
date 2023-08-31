class Student {
    // 생성자
    constructor(name, score) {
        this.name = name;
        this.score = score;
    };

    show () {
        return `${this.name} (${this.score}점)`
    }
}