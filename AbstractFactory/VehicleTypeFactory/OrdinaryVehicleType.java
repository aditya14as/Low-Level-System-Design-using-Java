package AbstractFactory.VehicleTypeFactory;

public class OrdinaryVehicleType implements VehicleTypeFactory{
    @Override
    public void create() {
        System.out.println("Creating an ordinary vehicle type.");
    }
}
