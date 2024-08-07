package AbstractFactory;

import AbstractFactory.AbstractVehicle.LuxuryVehicleFactory;
import AbstractFactory.AbstractVehicle.OrdinaryVehicleFactory;
import AbstractFactory.AbstractVehicle.VehicleFactory;
import AbstractFactory.VehicleTypeFactory.Vehicle;

//Abstract factory is the factory of factory.
//Here we created factory for BMW, Swift etc after that created factory for Luxury and ordinary vehicle
//We use this when we can group multiple items together.

public class AbstractFactory {
    public static void main(String[] args) {
        VehicleFactory factory;
        factory = new LuxuryVehicleFactory();
        Vehicle luxuryVehicle = factory.createVehicle("bmw");
        luxuryVehicle.getAverage();

        factory = new OrdinaryVehicleFactory();
        Vehicle ordinaryVehicle = factory.createVehicle("swift");
        ordinaryVehicle.getAverage();
    }
}
