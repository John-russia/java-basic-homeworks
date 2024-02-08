package ru.ivanov.java.basic.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", 5, 10);
        Dog dog2 = new Dog("Тузик", 5, 20);
        Horse horse1 = new Horse("Ланцелот", 10, 100);
        Cat cat1 = new Cat("Мурзик", 3, 7);
        dog1.info();
        System.out.println(dog1.run(6));
        dog1.info();
        System.out.println(dog1.run(6));
        dog1.info();
        System.out.println();
        System.out.println(dog2.swim(6));
        dog2.info();
        System.out.println(dog2.swim(6));
        dog2.info();
        System.out.println();
        System.out.println(horse1.swim(6));
        horse1.info();
        System.out.println(horse1.swim(26));
        horse1.info();
        System.out.println();
        System.out.println(cat1.run(7));
        cat1.info();
    }
}


