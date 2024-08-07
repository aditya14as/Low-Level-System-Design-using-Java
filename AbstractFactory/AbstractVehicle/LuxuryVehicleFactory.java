package AbstractFactory.AbstractVehicle;

import AbstractFactory.VehicleTypeFactory.*;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String name) {
        if (name.equalsIgnoreCase("bmw")){
            return new BMW();
        }
        return new Mercedes();
    }

    @Override
    public VehicleTypeFactory createVehicleType() {
        return new LuxuryVehicleType();
    }
}
