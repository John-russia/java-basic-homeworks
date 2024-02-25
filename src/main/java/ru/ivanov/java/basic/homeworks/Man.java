package ru.ivanov.java.basic.homeworks;

public class Man {
    private final String name;
    private int power;
    private Transport currentTransport;

    public Man(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public void info() {
        System.out.print("Человек " + name + ", сил: " + power + ", ");
        if (currentTransport != null) {
            System.out.println("использует " + currentTransport.toString() + ".");
        } else {
            System.out.println("идет пешком.");
        }
    }

    public boolean move(int distance, TerrainTypes terrainTypes) {
        if (currentTransport != null) {
            return currentTransport.drive(distance, terrainTypes);
        } else {
            boolean result = power >= distance;
            if (result) {
                power -= distance;
            }
            return result;
        }
    }
}
