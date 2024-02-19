package ru.ivanov.java.basic.homeworks;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        System.out.print("Кот " + name + ", ");
        if (satiety) {
            System.out.println("сытый");
        } else {
            System.out.println("голодный");
        }
    }

    public void eat(Plate plate) {
        if (this.satiety) {
            System.out.println(name + " не голодный и кушать не будет!");
            return;
        }
        if (plate.decreaseFoodFromPlate(this.appetite)) {
            this.satiety = true;
            System.out.println("Кот " + this.name + " съел из тарелки " + this.appetite + " еды и теперь сытый.");
        } else {
            System.out.println("Коту по имени " + this.name + " не хватило еды.");
        }
    }
}
