import cars.HybridCar;
import cars.TransmissionType;
import engine.CarEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    CarEngine engine;

    @Before
    public void setUp(){
        engine = new CarEngine("hybrid petrol and electric");
        hybridCar = new HybridCar ("Volkswagen", "Passat", 12000.00, "Black", engine, 2, 110, TransmissionType.AUTOMATIC, 70, 60);
    }

    @Test
    public void canGetMake() {
        assertEquals("Volkswagen", hybridCar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Passat", hybridCar.getModel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(12000.00, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", hybridCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals("hybrid petrol and electric", hybridCar.getEngineType());
    }

    @Test
    public void canGetNumberOfTyres() {
        assertEquals(4, hybridCar.getNumberOfTyres());
    }

    @Test
    public void canGetNumberOfDoors() {
        assertEquals(2, hybridCar.getNumberOfDoors());
    }

    @Test
    public void canGetTopSpeed() {
        assertEquals(110, hybridCar.getTopSpeed());
    }

    @Test
    public void canGetTransmissionType() {
        assertEquals(TransmissionType.AUTOMATIC, hybridCar.getTransmissionType());
    }

    @Test
    public void canGetMpg() {
        assertEquals(70, hybridCar.getMpg());
    }

    @Test
    public void canGetRange() {
        assertEquals(60, hybridCar.getRange());
    }

}
