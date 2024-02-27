package ru.ivanov.java.basic.homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println(sequence(1, 5));
        System.out.println(sumOverFiveNumbers(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))));
        System.out.println(changeEveryElementOfListToNumber(5, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))));
        System.out.println(everyElementPlusNumber(5, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))));

        ArrayList<Employee> listOfEmployees = new ArrayList<>(Arrays.asList(
                new Employee("Валера", 20),
                new Employee("Оксана", 25),
                new Employee("Андрюша", 19)
        ));

        System.out.println(namesOfEmployees(listOfEmployees));
        System.out.println(selectByAge(20, listOfEmployees));
        System.out.println(isOverageAgeExceedsNumber(22, listOfEmployees));
        System.out.println(youngestEmployee(listOfEmployees));


    }

    public static ArrayList<Integer> sequence(int min, int max) {
        ArrayList<Integer> outList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            outList.add(i);
        }
        return outList;
    }

    public static Integer sumOverFiveNumbers(ArrayList<Integer> inputList) {
        Integer result = 0;
        for (Integer i : inputList) {
            if (i > 5) {
                result += i;
            }
        }
        return result;
    }

    public static ArrayList<Integer> changeEveryElementOfListToNumber(int number, ArrayList<Integer> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            inputList.set(i, number);
        }
        return inputList;
    }

    public static ArrayList<Integer> everyElementPlusNumber(int number, ArrayList<Integer> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            inputList.set(i, inputList.get(i) + number);
        }
        return inputList;
    }

    public static ArrayList<String> namesOfEmployees(ArrayList<Employee> inputList) {
        ArrayList<String> outList = new ArrayList<>();
        for (Employee i : inputList) {
            outList.add(i.getName());
        }
        return outList;
    }

    public static ArrayList<Employee> selectByAge(int minAge, ArrayList<Employee> inputList) {
        ArrayList<Employee> outList = new ArrayList<>();
        for (Employee i : inputList) {
            if (i.getAge() >= minAge) {
                outList.add(i);
            }
        }
        return outList;
    }

    public static boolean isOverageAgeExceedsNumber(int number, ArrayList<Employee> inputList) {
        int sum = 0;
        double overageAge = 0;
        for (Employee i : inputList) {
            sum += i.getAge();
        }
        overageAge = (double) sum / inputList.size();
        return overageAge > number;
    }

    public static Employee youngestEmployee(ArrayList<Employee> inputList) {
        int minAge = inputList.get(0).getAge();
        Employee result = inputList.get(0);
        for (Employee i : inputList) {
            if (i.getAge() < minAge) {
                minAge = i.getAge();
                result = i;
            }
        }
        return result;
    }
}
