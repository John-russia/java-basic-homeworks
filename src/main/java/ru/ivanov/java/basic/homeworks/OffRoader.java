package ru.ivanov.java.basic.homeworks;

public class OffRoader extends Transport {
    private int fuelQuantity;
    private int fuelConsumption = 5;

    public OffRoader(String name, int fuelQuantity) {
        super(name);
        this.fuelQuantity = fuelQuantity;
    }

    @Override
    public void info() {
        System.out.println(name + ", запас топлива: " + fuelQuantity);
    }

    @Override
    public boolean drive(int distance, TerrainTypes terrainTypes) {
        if (fuelQuantity / fuelConsumption >= distance) {
            fuelQuantity -= distance * fuelConsumption;
            System.out.println("Перемещение на ТС: " + name + " по типу местности: " + terrainTypes.getType() + " на расстояние: " + distance);
            return true;
        }
        System.out.println("На перемещение не хватит топлива!");
        return false;
    }
}
