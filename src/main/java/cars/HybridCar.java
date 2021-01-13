package cars;

import engine.CarEngine;

public class HybridCar extends Car{

    int mpg;
    int range;

    public HybridCar(String make, String model, double price, String colour, CarEngine carEngine, int numberOfDoors, int topSpeed, TransmissionType transmission, int mpg, int range){
        super(make, model, price, colour, carEngine, numberOfDoors, topSpeed, transmission);
        this.mpg = mpg;
        this.range = range;
    }

    public int getMpg(){
        return this.mpg = mpg;
    }

    public int getRange(){
        return this.range = range;
    }

}
