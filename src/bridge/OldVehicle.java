package bridge;

public class OldVehicle implements VehicleType{
    @Override
    public void book() {
        System.out.println(" : Old Vehicle");
    }
}
