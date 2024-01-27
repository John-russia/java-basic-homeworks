package ru.ivanov.java.basic.homeworks.homework2;

import java.util.Arrays;

public class Application {

    // Метод печатает строку "inputString" n раз.
    public static void printStringNtimes(String inputString, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(inputString);
        }
    }

    // Метод принимает целочисленный массив и суммирует его элементы, значение которых больше 5.
    public static void sumOfArrayElementsBigger5(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма элементов массива " + Arrays.toString(arr) + ", превышающих 5, равна: " + sum);
    }

    // Метод, заполняющий массив указанным числом.
    public static void arrayFullfilment(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        System.out.println("Заполненный массив" + Arrays.toString(arr));
    }

    // Метод, увеличивающий каждый элемент массива на указанное число.
    public static void arrayEveryElementPlusN(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n;
        }
        System.out.println("Измененный массив" + Arrays.toString(arr));
    }

    // Метод, сумма первой или второй половины больше. Подразумеваем, что количество элементов чётное.
    public static void arrayPartsComparison(int[] arr) {
        int sumPart1 = 0;
        int sumPart2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumPart1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumPart2 += arr[i];
        }
        if (sumPart1 > sumPart2) {
            System.out.println("Сумма элементов первой части больше суммы элементов второй части");
        } else if (sumPart1 < sumPart2) {
            System.out.println("Сумма элементов второй части больше суммы элементов первой части");
        } else {
            System.out.println("Суммы элементов в левой и правой части массива равны");
        }
    }

    public static void main(String[] args) {
        printStringNtimes("Пчела - молодец, она делает мёд", 5);
        System.out.println();
        sumOfArrayElementsBigger5(new int[]{1, 2, 3, 5, 6, 10});
        System.out.println();
        int[] arr1 = {1, 2, 3, 5, 6, 10};
        arrayFullfilment(arr1, 5);
        System.out.println();
        arrayEveryElementPlusN(arr1, 5);
        System.out.println();
        arrayPartsComparison(new int[]{1, 3, 3, 1, 3, 4});
    }
}
