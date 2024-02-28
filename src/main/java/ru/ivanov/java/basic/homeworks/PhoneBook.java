package ru.ivanov.java.basic.homeworks;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneBook = new HashMap<>();

    public void print() {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Имя: " + entry.getValue() + " | Телефон: " + entry.getKey());
        }
    }

    public void add(String name, String phoneNumber) {
        this.phoneBook.put(phoneNumber, name);
    }

    public void find(String name) {
        System.out.print("Номер(а) телефона(ов) для пользователя с именем: " + name + " --> ");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.print(entry.getKey() + " | ");
            }
        }
        System.out.println();
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        return phoneBook.containsKey(phoneNumber);
    }
}
