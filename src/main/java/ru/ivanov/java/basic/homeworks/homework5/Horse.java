package ru.ivanov.java.basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }

    public float swim(int distance) {
        if ((4 * distance) > this.endurance) {
            this.endurance = 0;
            System.out.println("У " + name + " появилось состояние усталости");
            return -1;
        } else {
            this.endurance -= (4 * distance);
            float time = (float) distance / this.speed;
            System.out.println(name + " проплыл " + distance + "м за " + time + "сек");
            return time;
        }
    }
}
