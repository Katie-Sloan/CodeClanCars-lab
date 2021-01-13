import cars.Car;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Car> cars;
    private double till;

    public Dealership(String name, double till){
        this.name = name;
        this.cars = new ArrayList<Car>();
        this.till = till;
    }

    public String getName() {
        return this.name;
    }

    public int stockCount() {
        return this.cars.size();
    }

    public double tillCount() {
        return this.till;
    }

    public void buyCar(Car car) {
        this.cars.add(car);
        this.till -= car.getPrice();
    }

    public Car findCar(String model) {
        Car foundCar = null;
        for (Car car : this.cars) {
            if (car.getModel() == model) {
                foundCar = car;
            }
        }
        return foundCar;
    }

    public void sellCar(String model) {
        Car foundCar = findCar(model);
        this.cars.remove(foundCar);
        this.till += (foundCar.getPrice());
    }

}
