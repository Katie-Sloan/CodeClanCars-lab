import cars.Car;

import java.util.ArrayList;

public class Customer {
    double wallet;
    ArrayList<Car> ownedCars;

    public Customer(double wallet){
        this.wallet = wallet;
        this.ownedCars = new ArrayList<Car>();
    }

    public double getWallet() {
        return this.wallet;
    }

    public int noOfOwnedCars() {
        return this.ownedCars.size();
    }

    public void buyCar(Car car) {
        if (car.getPrice() <= this.wallet){
            this.ownedCars.add(car);
            this.wallet -= car.getPrice();
        }
    }
}
