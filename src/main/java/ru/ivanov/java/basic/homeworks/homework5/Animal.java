package ru.ivanov.java.basic.homeworks.homework5;

public class Animal {
    protected String name;
    protected int speed;
    protected int endurance;

    public Animal(String name, int speed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
    }

    public void info() {
        System.out.println("У животного " + name + " " + endurance + " выносливости");
    }

    public float run(int distance) {
        if (distance > this.endurance) {
            this.endurance = 0;
            System.out.println("У " + name + " появилось состояние усталости");
            return -1;
        } else {
            this.endurance -= distance;
            float time = (float) distance / this.speed;
            System.out.println(name + " пробежал " + distance + "м за " + time + "сек");
            return time;
        }
    }
}
