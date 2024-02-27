package ru.ivanov.java.basic.homeworks;

import java.util.Arrays;

public class Bicycle extends Transport {
    private TerrainTypes[] restrictedTerrainTypes = {TerrainTypes.SWAMP};

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println(name);
    }

    @Override
    public boolean drive(int distance, TerrainTypes terrainType) {
        if (Arrays.asList(restrictedTerrainTypes).contains(terrainType)) {
            System.out.println("На велосипеде нельзя перемещаться по типу местности: " + terrainType.getType());
            return false;
        }
        System.out.println("Перемещение на ТС: " + name + " по типу местности: " + terrainType.getType() + " на расстояние: " + distance);
        return true;
    }
}
