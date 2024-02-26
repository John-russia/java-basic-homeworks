package ru.ivanov.java.basic.homeworks;

public class AppArrayDataException extends Exception {
    public AppArrayDataException(int pos1, int pos2) {
        super("В ячейке [" + pos1 + "][" + pos2 + "] нечисловое значение");
    }
}
