package com.company.сlevertec;

import com.company.сlevertec.cars.Trucks;
import com.company.сlevertec.order.OrderForTrucks;
import com.company.сlevertec.repository.TaxiDepot;

public class Main {

    public static void main(String[] args) {
        //создаем экземпляр класса грузовиков и записываем в него объет из репозитория
        Trucks trucks = new TaxiDepot().getAllTruck().get(1);
        //задаем статус заправленнсти машины топливом
        trucks.setStatusRefuel(true);
        //задаем статус работоспособности машины
        trucks.setStatusRepair(true);
        //добавляем заказы для данного грузовика
        trucks.addOrderForTrucks(new OrderForTrucks("Гомель", "Минск", "Мебель", 1000));
        trucks.addOrderForTrucks(new OrderForTrucks("Минск", "Гомель", "Пенопласт", 500));
        trucks.addOrderForTrucks(new OrderForTrucks("Минск", "Гомель", "Кирпич", 5000));
        //смотрим весь список заказов
        trucks.showOrderForTrucksList();
        //задаем статус оплобированновти груза
        trucks.setStatusSealing(true);
        //смотрим оставшуюся грузоподъемность
        trucks.showFreeTonnage();
        //выгружаем заказ
        trucks.removeOrderForTrucks(0);
        //снова смотрим оставшуюся грузоподъемность после разгрузки
        trucks.showFreeTonnage();
        // смотрим всю информацию о данном грузовике на данный момент
        System.out.println(trucks);
        //задаем статус роботоспособности данного грузовика
        trucks.setStatusRepair(false);
    }
}
