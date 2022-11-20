package com.company.сlevertec.cars;

import com.company.сlevertec.enam.Fuel;
import com.company.сlevertec.order.OrderForPassengers;

import java.util.ArrayList;
import java.util.List;

//  класс отображющий сущность пассажирских машин
public class PassengerCar extends Car {

    private int numberPassengers;
    private List<OrderForPassengers> orderForPassengersList;

    public PassengerCar(String brand, String model, int yearRelease, Fuel fuel, int numberPassengers) {
        super(brand, model, yearRelease, fuel);
        this.numberPassengers = numberPassengers;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public List<OrderForPassengers> getOrderForPassengersList() {
        return orderForPassengersList;
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
    public int freePassengerSeats() {
        return getNumberPassengers() - getOrderForPassengersList().stream().mapToInt(OrderForPassengers::getNumberPassengers).sum();
    }

    // метод выводит на экран количество сводных мест
    public void showFreePassengerSeats() {
        System.out.println("Количество свободных мест: " + freePassengerSeats());
    }
}
