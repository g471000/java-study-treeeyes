package ch07.exercises;

class Unit {
}

class AirUnit extends Unit {
}

class GroundUnit extends Unit {
}

class Tank extends GroundUnit {
}

class AirCraft extends AirUnit {
}

class Ex15 {
    public static void main(String[] args) {
        Unit u = new GroundUnit();
        Tank t = new Tank();
        AirCraft ac = new AirCraft();
    }
}

//a. u = (Unit)ac; okay. Unit is anchester of AirCraft
//b. u = ac; okay too. same as a.
//c. GroundUnit gu = (GroundUnit)u; sure.
//d. AirUnit au = ac; sure. AirUnit is Parent of AirCraft
//e. t = (Tank)u; No. Unit cannot be casted as Tank.
//f. GroundUnit gu = t; sure. Tank is type of GroundUnit
