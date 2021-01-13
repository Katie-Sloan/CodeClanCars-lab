package cars;


import engine.CarEngine;



public class TradCar extends Car{

    int mpg;

    public TradCar(String make, String model, double price, String colour, CarEngine carEngine, int numberOfDoors, int topSpeed, TransmissionType transmission, int mpg){
        super(make, model, price, colour, carEngine, numberOfDoors, topSpeed, transmission);
        this.mpg = mpg;
    }





}
