package com.company.сlevertec.cars;

import com.company.сlevertec.enam.Fuel;

// абстрактный родительский  класс отображющий сущность машины
public abstract class Car {

    private boolean statusRefuel;
    private boolean statusRepair;

    private String brand;
    private String model;
    private int yearRelease;
    private Fuel fuel;


    public Car(String brand, String model, int yearRelease, Fuel fuel) {
        this.brand = brand;
        this.model = model;
        this.yearRelease = yearRelease;
        this.fuel = fuel;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public boolean isStatusRefuel() {
        return statusRefuel;
    }

    // метод задает состояние запрвленности машины топливом
    public void setStatusRefuel(boolean statusRefuel) {
        this.statusRefuel = statusRefuel;
        System.out.println(statusRefuel ? "Машина заправлена" : "Нужно заправить машину");
    }

    public boolean isStatusRepair() {
        return statusRepair;
    }

    // метод задает состояние работоспособности машины
    public void setStatusRepair(boolean statusRepair) {
        this.statusRepair = statusRepair;
        System.out.println(statusRepair ? "Машина в рабочем состоянии" : "Нужно отремонтировать машину");
    }

    @Override
    public String toString() {
        return "Car{" +
                "statusRefuel=" + statusRefuel +
                ", statusRepair=" + statusRepair +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", fuel=" + fuel +
                '}';
    }
}
