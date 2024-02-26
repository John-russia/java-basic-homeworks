package ru.ivanov.java.basic.homeworks;

public class Application {
    public static void main(String[] args) {
        String[][][] testArrays = {
                {{"1", "2" }, {"1", "2" }},
                {{"1", "2" }, {"1", "2" }, {"1", "2" }, {"1", "2" }},
                {{"1", "2", "3", "4" }, {"1", "2", "3", "4" }, {"1", "2", "3" }, {"1", "2", "3", "4" }},
                {{"1", "2", "a", "4" }, {"1", "2", "3", "4" }, {"1", "2", "3", "4" }, {"1", "2", "3", "4" }},
                {{"1", "2", "3", "4" }, {"1", "2", "3", "4" }, {"1", "2", "3", "4" }, {"1", "2", "3", "4" }}
        };

        for (String[][] array : testArrays) {
            try {
                System.out.println("Сумма элементов переданного массива = " + sumArrayElements(array));
            } catch (AppArraySizeException e) {
                System.out.println("Размер массива неверный, " + e);
            } catch (AppArrayDataException e) {
                System.out.println("Один из элементов косячный, " + e);
            }
        }
    }

    public static int sumArrayElements(String[][] arr) throws AppArrayDataException, AppArraySizeException {
        if (!testSizeArrayFor4X4(arr)) {
            throw new AppArraySizeException("Неверный Размер");
        }
        int summ = 0;
        int pos1 = 0;
        int pos2 = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    pos1 = i;
                    pos2 = j;
                    summ += Integer.parseInt(arr[i][j]);
                }
            }
            return summ;
        } catch (NumberFormatException e) {
            throw new AppArrayDataException(pos1, pos2);
        }
    }

    public static boolean testSizeArrayFor4X4(String[][] arr) {
        if (arr.length != 4) {
            return false;
        }
        for (String[] i : arr) {
            if (i.length != 4) {
                return false;
            }
        }
        return true;
    }
}
