package AbstractFactory.AbstractVehicle;

import AbstractFactory.VehicleTypeFactory.*;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String name) {
        if (name.equalsIgnoreCase("swift")) {
            return new Swift();
        }else{
            return new Hyundai();
        }
    }
    @Override
    public VehicleTypeFactory createVehicleType() {
        return new OrdinaryVehicleType();
    }
}
