package ru.ivanov.java.basic.homeworks.homework4;

public class Box {
    final int length;
    final int width;
    final int height;
    private String color;
    private String itemInside;
    private boolean isOpened;


    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpened = false;
    }

    public void printInfo() {
        System.out.println("Длина:" + length + " Ширина:" + width + " Высота:" + height);
        System.out.println("Цвет коробки: " + color);
        if (isOpened) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (itemInside != null) {
            System.out.println("В коробке лежит " + itemInside);
        }
        System.out.println();
    }

    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Цвет коробки изменен на " + newColor);
    }

    public void open() {
        this.isOpened = true;
        System.out.println("Коробку открыли");
    }

    public void close() {
        this.isOpened = false;
        System.out.println("Коробку закрыли");
    }

    public void putItemInside(String item) {
        if (!isOpened) {
            System.out.println("Нельзя ничего положить в закрытую коробку, сначала её нужно открыть");
            return;
        }
        if (itemInside != null) {
            System.out.println("В коробке уже лежит " + this.itemInside + ". Извлеките, прежде, чем что-то положить");
            return;
        } else {
            this.itemInside = item;
            System.out.println("В коробку положили " + item);
        }
    }

    public void extractItem() {
        if (!isOpened) {
            System.out.println("Ничего нельзя достать из закрытой коробки, сначала её нужно открыть");
            return;
        }
        if (itemInside == null) {
            System.out.println("В коробке ничего не лежит, прежде,чем достать оттуда что-то ненужное, положите туда что-то ненужное");
            return;
        } else {
            System.out.println("Из коробки извлекли " + this.itemInside);
            this.itemInside = null;
        }
    }
}
