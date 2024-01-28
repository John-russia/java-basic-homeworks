package ru.ivanov.java.basic.homeworks.homework3;

public class Application {

    public static int[][] fillArray() {
        int[][] array = new int[5][5];
        int ctr = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0) {
                    array[i][j] = ctr;
                } else {
                    array[i][j] = -ctr;
                }
                ctr++;
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfPositiveElements(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    result += array[i][j];
                }
            }
        }
        return result;
    }

    public static void printSquareOfAsterisks(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void nullInBothDiagonalsOfArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || (i + j == array.length - 1)) {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static int findMax(int[][] array) {
        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;
    }

    public static int sumElementsOfSecondRow(int[][] array) {
        int result = 0;
        boolean marker = false;
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                marker = true;
                for (int j = 0; j < array[i].length; j++) {
                    result += array[i][j];
                }
            }
        }
        if (marker) {
            return result;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[][] = fillArray();
        printArray(arr);
        System.out.println();
        System.out.println("Сумма положительных элементов: " + sumOfPositiveElements(arr));
        System.out.println();
        printSquareOfAsterisks(5);
        System.out.println();
        nullInBothDiagonalsOfArray(arr);
        printArray(arr);
        System.out.println();
        System.out.println(findMax(arr));
        System.out.println();
        System.out.println(sumElementsOfSecondRow(arr));
        System.out.println();
        int[][] arr2 = {{1, 2, 3}};
        System.out.println(sumElementsOfSecondRow(arr2));
    }
}
