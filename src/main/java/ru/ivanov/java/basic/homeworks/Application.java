package ru.ivanov.java.basic.homeworks;

public class Application {
    public static void main(String[] args) {
        Plate plate = new Plate(120);
        plate.info();
        Cat[] cats = {
                new Cat("Персик", 30),
                new Cat("Барсик", 40),
                new Cat("Пупсик", 60),
                new Cat("Шнапсик", 55),
                new Cat("Дымок", 15),
        };

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            cat.info();
        }
        plate.info();

        plate.addFoodToPlate(1000);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            cat.info();
        }
        plate.info();
    }
}
