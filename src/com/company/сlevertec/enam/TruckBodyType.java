package com.company.сlevertec.enam;

public enum TruckBodyType {

    AWNING("Тентованный"),
    REFRIGERATOR("Рефрижератор"),
    OPEN_ON_BOARD("Открытый бортовой"),
    OPEN("Открытая платформа"),
    TANK("Цистерна");

    private final String type;

    TruckBodyType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
