package Strategy;
public class AirDelivery implements DeliveryStrategy {
    @Override
    public void delivery() {
        System.out.println("Delivering via Air");
    }
}
