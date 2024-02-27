package ru.ivanov.java.basic.homeworks;

public enum TerrainTypes {
    DENSE_FOREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    TerrainTypes (String type) {
        this.type = type;
    }

    private final String type;

    public String getType() {
        return type;
    }
}
