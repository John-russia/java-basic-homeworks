package ru.ivanov.java.basic.homeworks;

public class Application {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Василий Василич", "123456");
        phoneBook.add("Василий Василич", "000001");
        phoneBook.add("Сергей Петрович", "1111111");
        phoneBook.add("Иммануил Гедеонович", "222222");
        phoneBook.add("Сурен Геворкович", "333333");
        phoneBook.print();
        System.out.println();
        phoneBook.find("Василий Василич");
        phoneBook.find("Иммануил Гедеонович");
        System.out.println();
        System.out.println(phoneBook.containsPhoneNumber("123456"));
        System.out.println(phoneBook.containsPhoneNumber("1111111"));
        System.out.println(phoneBook.containsPhoneNumber("5555555"));
    }
}
