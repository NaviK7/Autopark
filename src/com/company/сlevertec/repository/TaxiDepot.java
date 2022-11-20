package com.company.сlevertec.repository;

import com.company.сlevertec.cars.CargoPassengerCar;
import com.company.сlevertec.cars.PassengerCar;
import com.company.сlevertec.cars.Trucks;
import com.company.сlevertec.enam.Fuel;
import com.company.сlevertec.enam.FuelType;
import com.company.сlevertec.enam.TruckBodyType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Класс хранит данные объктов классов пассажирских , грузовых , грузопасажирских машин
public class TaxiDepot {

    public List<Trucks> getAllTruck() {
        List<Trucks> trucksList = new ArrayList<>();
        Trucks trucks1 = new Trucks("Iveco", "Daily", 2014, new Fuel(FuelType.BENZINE80, 32), TruckBodyType.AWNING, 6, 4000);
        Trucks trucks2 = new Trucks("Iveco", "Eurocargo", 2000, new Fuel(FuelType.BENZINE80, 50), TruckBodyType.AWNING, 10, 12000);
        Trucks trucks3 = new Trucks("Iveco", "Leoncino", 2010, new Fuel(FuelType.BENZINE95, 40), TruckBodyType.OPEN_ON_BOARD, 8, 10000);
        Collections.addAll(trucksList, trucks1, trucks2, trucks3);
        return trucksList;
    }

    public List<CargoPassengerCar> getAllCargoPassengerCar() {
        List<CargoPassengerCar> cargoPassengerCarList = new ArrayList<>();
        CargoPassengerCar cargoPassengerCar1 = new CargoPassengerCar("Газель", "3221", 2003, new Fuel(FuelType.BENZINE92, 30), 1500, 8);
        CargoPassengerCar cargoPassengerCar2 = new CargoPassengerCar("Газель", "33023", 2010, new Fuel(FuelType.BENZINE92, 15), 1000, 5);
        CargoPassengerCar cargoPassengerCar3 = new CargoPassengerCar("Газель", "2705−406", 1996, new Fuel(FuelType.DIESEL_L, 20), 2000, 6);
        Collections.addAll(cargoPassengerCarList, cargoPassengerCar1, cargoPassengerCar2, cargoPassengerCar3);
        return cargoPassengerCarList;
    }

    public List<PassengerCar> getAllPassengerCar() {
        List<PassengerCar> passengerCarList = new ArrayList<>();
        PassengerCar passengerCar1 = new PassengerCar("МАЗ", "232", 2014, new Fuel(FuelType.BENZINE98, 22), 59);
        PassengerCar passengerCar2 = new PassengerCar("МАЗ", "257", 2016, new Fuel(FuelType.BENZINE98, 20), 31);
        PassengerCar passengerCar3 = new PassengerCar("МАЗ", "251", 2004, new Fuel(FuelType.BENZINE98, 40), 49);
        Collections.addAll(passengerCarList, passengerCar1, passengerCar2, passengerCar3);
        return passengerCarList;
    }
}
