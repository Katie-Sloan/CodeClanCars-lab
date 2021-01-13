import cars.Car;
import cars.ElectricCar;
import cars.TradCar;
import cars.TransmissionType;

import engine.CarEngine;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;
    CarEngine engine;

    @Before
    public void setUp(){
        engine = new CarEngine("electric");
        electricCar = new ElectricCar ("Fiat", "500L", 8000.00, "Red", engine, 4, 100, TransmissionType.AUTOMATIC, 255);
    }

    @Test
    public void canGetMake() {
        assertEquals("Fiat", electricCar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("500L", electricCar.getModel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(8000.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", electricCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals("electric", electricCar.getEngineType());
    }

    @Test
    public void canGetNumberOfTyres() {
        assertEquals(4, electricCar.getNumberOfTyres());
    }

    @Test
    public void canGetNumberOfDoors() {
        assertEquals(4, electricCar.getNumberOfDoors());
    }

    @Test
    public void canGetTopSpeed() {
        assertEquals(100, electricCar.getTopSpeed());
    }

    @Test
    public void canGetTransmissionType() {
        assertEquals(TransmissionType.AUTOMATIC, electricCar.getTransmissionType());
    }

    @Test
    public void canGetRange() {
        assertEquals(255, electricCar.getRange());
    }

}
