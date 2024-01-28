package ru.ivanov.java.basic.homeworks.homework2asterisk;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static int maxArrayLength(int[]... arrays) {
        int maxLength = 0;
        for (int[] array : arrays) {
            if (array.length > maxLength) {
                maxLength = array.length;
            }
        }
        return maxLength;
    }

    public static void sumArrays(int[]... arrays) {
        int[] sumArr = new int[maxArrayLength(arrays)];
        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                sumArr[i] += array[i];
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(sumArr));
    }

    public static int arrayElementsSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static void prettyPrint(int[] arr1, int[] arr2) {
        System.out.print("{");
        for (int i : arr1) {
            System.out.print(i + ", ");
        }
        System.out.print("| ");
        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.print(arr2[arr2.length - 1] + "}");
    }

    public static void arrayPartsComparison(int[] arr) {
        boolean marker = false;
        for (int i = 0; i < arr.length - 1; i++) {
            int[] arr1 = new int[i + 1];
            int[] arr2 = new int[arr.length - (i + 1)];
            System.arraycopy(arr, 0, arr1, 0, i + 1);
            System.arraycopy(arr, i + 1, arr2, 0, arr.length - (i + 1));
            if (arrayElementsSum(arr1) == arrayElementsSum(arr2)) {
                prettyPrint(arr1, arr2);
                marker = true;
                break;
            }
        }
        if (!marker) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void arrayElementsAreDecreasing(int[] arr) {
        boolean marker = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                marker = false;
                break;
            }
        }
        if (marker) {
            System.out.println("Все элементы массива идут в порядке убывания");
        } else {
            System.out.println("Элементы массива НЕ идут в порядке убывания");
        }
    }

    public static void arrayElementsAreIncreasing(int[] arr) {
        boolean marker = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                marker = false;
                break;
            }
        }
        if (marker) {
            System.out.println("Все элементы массива идут в порядке возрастания");
        } else {
            System.out.println("Элементы массива НЕ идут в порядке возрастания");
        }
    }

    public static void arrayEncreaseDecrease(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 для оценки массива на убывание, 2 - на возрастание --> ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            arrayElementsAreDecreasing(arr);
        } else if (choice == 2) {
            arrayElementsAreIncreasing(arr);
        } else System.out.println("Выбор неверный");
    }

    public static void arrayReverse(int[] arr) {
        System.out.println("Исходный массив -> " + Arrays.toString(arr));
        int[] arrTmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrTmp[i] = arr[arr.length - 1 - i];
        }
        arr = arrTmp;
        System.out.println("Перевернутый массив -> " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5};
        int[] array3 = {6, 7, 8, 9, 10, 15, 20};
        int[] array4 = {1, 1, 1, 1, 1, 5};
        int[] array5 = {5, 3, 4, -2};
        int[] array6 = {7, 2, 2, 2};

        sumArrays(array1, array2, array3);
        System.out.println();
        arrayPartsComparison(array4);
        System.out.println();
        arrayEncreaseDecrease(array5);
        arrayReverse(array6);
    }
}
