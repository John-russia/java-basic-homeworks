package ru.ivanov.java.basic.homeworks;

public class Plate {
    private final int maxFoodQuantity;
    private int currentFoodQuantity;

    public Plate(int maxFoodQuantity) {
        this.maxFoodQuantity = maxFoodQuantity;
        this.currentFoodQuantity = this.maxFoodQuantity;
    }

    public void info() {
        System.out.println("Тарелка вместимостью " + maxFoodQuantity + ". Текущее количество еды: " + currentFoodQuantity);
    }

    public void addFoodToPlate(int foodToAddQuantity) {
        int newQuantity = this.currentFoodQuantity + foodToAddQuantity;
        if (newQuantity > this.maxFoodQuantity) {
            currentFoodQuantity = maxFoodQuantity;
        } else {
            currentFoodQuantity = newQuantity;
        }
    }

    public boolean decreaseFoodFromPlate(int foodToGetFromPlate) {
        int newQuantity = this.currentFoodQuantity - foodToGetFromPlate;
        if (newQuantity >= 0) {
            currentFoodQuantity = newQuantity;
            return true;
        } else {
            return false;
        }
    }
}
