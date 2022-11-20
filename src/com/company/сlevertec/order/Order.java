package com.company.сlevertec.order;

import java.time.LocalDate;

// абстрактный родительский  класс отображющий сущность заказа
public abstract class Order {

    private String startingPoint;
    private String endPoint;
    private final LocalDate dateCreation;

    public Order(String startingPoint, String endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
        this.dateCreation = LocalDate.now();
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }
}
