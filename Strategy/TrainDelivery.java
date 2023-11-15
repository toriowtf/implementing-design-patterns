package Strategy;
public class TrainDelivery implements DeliveryStrategy {
    @Override
    public void delivery() {
        System.out.println("Delivering via Train");
    }
}
