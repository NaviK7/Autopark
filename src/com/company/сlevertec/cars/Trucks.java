package com.company.сlevertec.cars;

import com.company.сlevertec.enam.Fuel;
import com.company.сlevertec.order.OrderForTrucks;
import com.company.сlevertec.enam.TruckBodyType;

import java.util.ArrayList;
import java.util.List;

// класс отображющий сущность грузовых машин
public class Trucks extends Car {

    private boolean statusSealing;

    private final TruckBodyType truckBodyType;
    private final int bodyVolume;
    private final int tonnage;
    private List<OrderForTrucks> orderForTrucksList;


    public Trucks(String brand, String model, int yearRelease, Fuel fuel, TruckBodyType truckBodyType, int bodyVolume, int tonnage) {
        super(brand, model, yearRelease, fuel);
        this.truckBodyType = truckBodyType;
        this.bodyVolume = bodyVolume;
        this.tonnage = tonnage;
    }

    public int getBodyVolume() {
        return bodyVolume;
    }

    public int getTonnage() {
        return tonnage;
    }

    public boolean isStatusSealing() {
        return statusSealing;
    }

    public List<OrderForTrucks> getOrderForTrucksList() {
        return orderForTrucksList;
    }

    //метод задает состояние опломбировки груза
    public void setStatusSealing(boolean statusSealing) {
        this.statusSealing = statusSealing;
        System.out.println(statusSealing ? "Груз опломбирован" : "Груз требует пломбировки");
    }

    //метод показывает список заказов
    public void showOrderForTrucksList() {
        System.out.println(orderForTrucksList);

    }

    //метод иметирующий загрузку груза
    public void addOrderForTrucks(OrderForTrucks orderForTrucks) {
        if (orderForTrucksList == null) {
            orderForTrucksList = new ArrayList<>();
        }
        orderForTrucksList.add(orderForTrucks);
    }

    //метод иметирующий выгрузку груза
    public void removeOrderForTrucks(int index) {
        orderForTrucksList.remove(index);
    }

    // метод возвращает остаток грузоподъемности
    public double setFreeTonnage() {
        return getTonnage() - getOrderForTrucksList().stream().mapToDouble(OrderForTrucks::getWeight).sum();

    }

    // метод выводит на экран  остаток грузоподъемности
    public void showFreeTonnage() {
        System.out.println("Остаток грузободъемности: " + setFreeTonnage());
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "statusRefuel=" + isStatusRefuel() +
                ", statusRepair=" + isStatusRepair() +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearRelease=" + getYearRelease() +
                ", fuel=" + getFuel() +
                ", statusSealing=" + statusSealing +
                ", truckBodyType=" + truckBodyType +
                ", bodyVolume=" + bodyVolume +
                ", tonnage=" + tonnage + " кг" +
                ", orderForTrucksList=" + orderForTrucksList +
                '}';
    }
}
