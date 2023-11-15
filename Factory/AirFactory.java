package Factory;

public class AirFactory implements TransportFactory {
    public void orderVehicle() {
        System.out.println("AirPlane is ordered for this Package");
    }
}
