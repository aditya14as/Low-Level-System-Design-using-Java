package AbstractFactory.VehicleTypeFactory;

public class LuxuryVehicleType implements VehicleTypeFactory{
    @Override
    public void create() {
        System.out.println("Creating a luxury vehicle type.");
    }
}
