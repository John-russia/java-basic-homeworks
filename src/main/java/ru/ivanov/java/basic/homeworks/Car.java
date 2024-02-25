package ru.ivanov.java.basic.homeworks;

import java.util.Arrays;

public class Car extends Transport {

    private int fuelQuantity;
    private int fuelConsumption = 2;
    private TerrainTypes[] restrictedTerrainTypes = {TerrainTypes.valueOf("густой_лес"), TerrainTypes.valueOf("болото")};

    public Car(String name, int fuelQuantity) {
        super(name);
        this.fuelQuantity = fuelQuantity;
    }

    @Override
    public void info() {
        System.out.println(name + ", запас топлива: " + fuelQuantity);
    }

    @Override
    public boolean drive(int distance, TerrainTypes terrainTypes) {
        if (Arrays.asList(restrictedTerrainTypes).contains(terrainTypes)) {
            System.out.println("На машине нельзя перемещаться по типу местности: " + terrainTypes);
            return false;
        }
        if (fuelQuantity / fuelConsumption >= distance) {
            fuelQuantity -= distance * fuelConsumption;
            System.out.println("Перемещение на ТС: " + name + " по типу местности: " + terrainTypes + " на расстояние: " + distance);
            return true;
        }
        System.out.println("На перемещение не хватит топлива!");
        return false;
    }
}
