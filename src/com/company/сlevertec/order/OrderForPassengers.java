package com.company.сlevertec.order;

// класс отображющий сущность заказа для пассажирских машин
public class OrderForPassengers extends Order {

    private int numberPassengers;

    public OrderForPassengers(String startingPoint, String endPoint, int numberPassengers) {
        super(startingPoint, endPoint);
        this.numberPassengers = numberPassengers;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    @Override
    public String toString() {
        return "OrderForPassengers{" +
                "startingPoint='" + getStartingPoint() + '\'' +
                ", endPoint='" + getEndPoint() + '\'' +
                ", dateCreation=" + getDateCreation() + '\'' +
                ", numberPassengers=" + numberPassengers +
                '}';
    }
}
