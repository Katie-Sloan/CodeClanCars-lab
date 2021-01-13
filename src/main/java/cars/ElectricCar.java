package cars;

import engine.CarEngine;

public class ElectricCar extends Car{

    int range;

    public ElectricCar(String make, String model, double price, String colour, CarEngine carEngine, int numberOfDoors, int topSpeed, TransmissionType transmission, int range){
        super(make, model, price, colour, carEngine, numberOfDoors, topSpeed, transmission);
        this.range = range;
    }
}
