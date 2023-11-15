package Factory;

public class TrainDialog implements TransportDialog {
    @Override
    public TransportFactory createVehicle() {
        return new TrainFactory();
    }
}
