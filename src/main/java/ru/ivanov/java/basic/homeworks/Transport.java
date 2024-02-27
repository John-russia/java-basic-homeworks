package ru.ivanov.java.basic.homeworks;

public abstract class Transport {
    protected String name;

    public Transport(String name) {
        this.name = name;
    }

    public abstract boolean drive(int distance, TerrainTypes terrainTypes);

    public abstract void info();

    @Override
    public String toString() {
        return name;
    }
}
