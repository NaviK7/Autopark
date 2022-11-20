package com.company.сlevertec.order;

// класс отображющий сущность заказа для грузовых машин
public class OrderForTrucks extends Order {

    private String typeCargo;
    private double weight;

    public OrderForTrucks(String startingPoint, String endPoint, String typeCargo, double weight) {
        super(startingPoint, endPoint);
        this.typeCargo = typeCargo;
        this.weight = weight;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    public void setTypeCargo(String typeCargo) {
        this.typeCargo = typeCargo;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "OrderForTrucks{" +
                "startingPoint='" + getStartingPoint() + '\'' +
                ", endPoint='" + getEndPoint() + '\'' +
                ", dateCreation=" + getDateCreation() + '\'' +
                ", typeCargo='" + typeCargo + '\'' +
                ", weight=" + weight +
                '}';
    }
}
