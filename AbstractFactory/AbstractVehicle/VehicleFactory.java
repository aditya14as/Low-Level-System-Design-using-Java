package AbstractFactory.AbstractVehicle;

import AbstractFactory.VehicleTypeFactory.Vehicle;
import AbstractFactory.VehicleTypeFactory.VehicleTypeFactory;

public interface VehicleFactory {
    Vehicle createVehicle(String name);
    VehicleTypeFactory createVehicleType();
}
