package ru.ivanov.java.basic.homeworks.homework4;

import java.time.Year;

public class Application {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иваныч", 1960, "ivan_ivanov@email.ru"),
                new User("Петров", "Иван", "Иваныч", 1970, "ivan_ivanov@email.ru"),
                new User("Сидоров", "Иван", "Иваныч", 1980, "ivan_ivanov@email.ru"),
                new User("Иванов", "Валерий", "Иваныч", 1990, "ivan_ivanov@email.ru"),
                new User("Петров", "Валерий", "Иваныч", 2000, "ivan_ivanov@email.ru"),
                new User("Сидоров", "Валерий", "Иваныч", 2010, "ivan_ivanov@email.ru"),
                new User("Иванов", "Семен", "Иваныч", 1965, "ivan_ivanov@email.ru"),
                new User("Петров", "Семен", "Иваныч", 1975, "ivan_ivanov@email.ru"),
                new User("Сидоров", "Семен", "Иваныч", 1985, "ivan_ivanov@email.ru"),
                new User("Смирнов", "Мирон", "Мироныч", 1995, "ivan_ivanov@email.ru")
        };
        int currentYear = Year.now().getValue();
        for (User user: users){
            if ((currentYear - user.getYearOfBirth()) > 40) {
                user.printInfo();
            }
        }

        System.out.println("Развлечения с коробкой");
        Box box1 = new Box(10, 15, 20, "magenta");
        box1.printInfo();
        box1.changeColor("blue");
        box1.printInfo();
        box1.putItemInside("красный молоток");
        box1.open();
        box1.putItemInside("красный молоток");
        box1.printInfo();
        box1.putItemInside("зеленый шарик");
        box1.extractItem();
        box1.putItemInside("зеленый шарик");
        box1.close();
        box1.printInfo();
        box1.extractItem();
        box1.open();
        box1.extractItem();
        box1.close();
        box1.printInfo();
    }
}
