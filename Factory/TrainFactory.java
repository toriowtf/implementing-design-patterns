package Factory;

public class TrainFactory implements TransportFactory {
    public void orderVehicle() {
        System.out.println("Train is ordered for this Package");
    }
}
