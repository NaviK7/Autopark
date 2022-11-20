package com.company.сlevertec.enam;

public enum FuelType {

    BENZINE80("АИ-80"),
    BENZINE92("АИ-92"),
    BENZINE95("АИ-95"),
    BENZINE98("АИ-98"),
    DIESEL_A("Дизель  арктический"),
    DIESEL_L("Дизель  летний"),
    DIESEL_Z("Дизель  зимний");


    private final String type;

    FuelType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
