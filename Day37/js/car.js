class Car {
    constructor(model, speed) {
        this.model = model;
        this.speed = speed;
    };

    show() {
        let msg = `${this.model} (${this.speed}km/h)`;
        return msg;
    };

    accel(n) {
        let pspeed = n + this.speed;
        this.speed = pspeed;
        let msg = `${n}km/h 가속 (현재 ${pspeed}km/h)`;
        return msg;
    };

    break(n) {
        let pspeed = this.speed - n;
        this.speed = pspeed;
        let msg = `${n}km/h 감속 (현재 ${pspeed}km/h)`;
        return msg;
    };
}