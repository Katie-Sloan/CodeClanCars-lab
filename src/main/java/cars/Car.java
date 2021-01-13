package cars;

import engine.CarEngine;

public abstract class Car {

    private String make;
    private String model;
    private double price;
    private String colour;
    private CarEngine carEngine;
    private int numberOfTyres;
    private int numberOfDoors;
    private int topSpeed;
    private TransmissionType transmission;

    public Car(String make, String model, double price, String colour, CarEngine carEngine, int numberOfDoors, int topSpeed, TransmissionType transmission) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.carEngine = carEngine;
        this.numberOfTyres = 4;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.transmission = transmission;

    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice () {
        return this.price;
    }


    public String getColour () {
        return this.colour;
    }

    public CarEngine getEngine () {
        return this.carEngine;
    }

    public int getNumberOfTyres() {
        return this.numberOfTyres;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public TransmissionType getTransmissionType() {
        return this.transmission;
    }

}
