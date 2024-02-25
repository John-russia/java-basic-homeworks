package ru.ivanov.java.basic.homeworks;

import java.util.Arrays;

public class Horse extends Transport {
    private int power;
    private int powerConsumption = 2;
    private TerrainTypes[] restrictedTerrainTypes = {TerrainTypes.valueOf("болото")};

    public Horse(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void info() {
        System.out.println(name + ", сил: " + power);
    }

    @Override
    public boolean drive(int distance, TerrainTypes terrainTypes) {
        if (Arrays.asList(restrictedTerrainTypes).contains(terrainTypes)) {
            System.out.println("На лошади нельзя перемещаться по типу местности: " + terrainTypes);
            return false;
        }
        if (power / powerConsumption >= distance) {
            power -= distance * powerConsumption;
            System.out.println("Перемещение на ТС: " + name + " по типу местности: " + terrainTypes + " на расстояние: " + distance);
            return true;
        }
        System.out.println("На перемещение не хватит сил!");
        return false;
    }
}
