package com.company.сlevertec.enam;

public class Fuel {
    private FuelType fuelType;
    private int consumption;

    public Fuel(FuelType fuelType, int consumption) {
        this.fuelType = fuelType;
        this.consumption = consumption;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "fuelType=" + fuelType +
                ", consumption=" + consumption +
                '}';
    }
}
