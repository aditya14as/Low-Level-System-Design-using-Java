package StrategyDesignPattern.WithStrategyPattern.Strategy;
// By using this feature we can create as many as DriveStrategy as we need
public class XyzDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("XYZ Drive Capability");
    }
}
