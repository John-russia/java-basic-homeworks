package ru.ivanov.java.basic.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class MainApp1 {

    // метод greetings(), который при вызове печатает в столбец 4 слова: Hello, World, from, Java;
    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    // метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c, и сообщает положительная
    // или отрицательная сумма этих аргументов;
    public static void checkSigns(int a, int b, int c){
        if ((a + b + c) >=0 ) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        };
    }

    // метод selectColor() в теле которого генерится int переменная data.
    // Если data:
    // меньше 10 включительно, то в консоль выводится значение data и цвет “Красный”
    // от 10 до 20 включительно, то в консоль выводится значение data и цвет “Желтый”,
    // если больше 20 - то в консоль выводится значение data и цвет “Зеленый”
    public static void selectColor(){
        int data = (int)(Math.random() * 50);
        if (data <= 10 ) {
            System.out.println("data = " + data + " Цвет: Красный");
        }
        else if (data <= 20 ) {
            System.out.println("data = " + data + " Цвет: Желтый");
        }
        else {
            System.out.println("data = " + data + " Цвет: Зеленый");
        };
    }

    // метод compareNumbers(), в теле которого генерятся две int переменные a и b
    // Если a больше или равно b, то в консоль выводится сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers(){
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        };
    }

    // метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    // Если increment = true, то метод к initValue прибавляет delta и печатает в консоль результат,
    // в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment) {
            System.out.println(initValue + delta);
        }
        else {
            System.out.println(initValue - delta);
        };
    }

    // выбираем методы, 0 - для выхода.
    public static void main(String[] args){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число от 1 до 5 для выбора метода, для выхода введите 0 --> ");
            int choice = scanner.nextInt();
            if (choice == 0){
                System.out.println("Спасибо за пользование");
                break;
            } else if (choice == 1){
                greetings();
            } else if (choice == 2) {
                checkSigns((int)(Math.random() * -100), (int)(Math.random() * 100), (int)(Math.random() * 100));
            } else if (choice == 3) {
                selectColor();
            } else if (choice == 4) {
                compareNumbers();
            } else if (choice == 5) {
                int val = (int)(Math.random() * 100);
                int d = (int)(Math.random() * 100);
                Random random = new Random();
                boolean incr = random.nextBoolean();
                addOrSubtractAndPrint(val, d, incr);
            } else {
                System.out.println("Неверный номер, попробуйте ещё раз");
            }
        }
        }

}
