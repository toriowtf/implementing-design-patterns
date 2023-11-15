package Factory;

public class AirDialog implements TransportDialog {
    @Override
    public TransportFactory createVehicle() {
        return new AirFactory();
    }
}
