package com.company.сlevertec.cars;

import com.company.сlevertec.enam.Fuel;
import com.company.сlevertec.order.OrderForPassengers;

import java.util.ArrayList;
import java.util.List;

// класс отображющий сущность грузопассажирских машин
public class CargoPassengerCar extends Car {

    private boolean statusDisinfection;

    private int tonnage;
    private int numberPassengers;
    private List<OrderForPassengers> orderForPassengersList;


    public CargoPassengerCar(String brand, String model, int yearRelease, Fuel fuel, int tonnage, int numberPassengers) {
        super(brand, model, yearRelease, fuel);
        this.tonnage = tonnage;
        this.numberPassengers = numberPassengers;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public boolean isStatusDisinfection() {
        return statusDisinfection;
    }

    public List<OrderForPassengers> getOrderForPassengersList() {
        return orderForPassengersList;
    }

    //метод задает состояние дезинфекции салона
    public void setStatusDisinfection(boolean statusDisinfection) {
        this.statusDisinfection = statusDisinfection;
        System.out.println(statusDisinfection ? "Салон продезинфицирован" : "Салон не продезинфицирован");
    }

    //метод иметирующий посадку посажиров
    public boolean addOrderForPassengers(OrderForPassengers orderForPassengers) {
        if (orderForPassengersList == null) {
            orderForPassengersList = new ArrayList<>();
        }
        return orderForPassengersList.add(orderForPassengers);
    }

    //метод иметирующий высодку пассажиров
    public boolean removeOrderForPassengers(OrderForPassengers orderForPassengers) {
        return orderForPassengersList.remove(orderForPassengers);
    }

    // метод возвращает количество сводных мест
    public int freePassengerSeatsCargo() {
        return getNumberPassengers() - getOrderForPassengersList().stream().mapToInt(OrderForPassengers::getNumberPassengers).sum();
    }

    // метод выводит на экран количество сводных мест
    public void showFreePassengerSeatsCargo() {
        System.out.println("Количество свободных мест: " + freePassengerSeatsCargo());
    }
}
