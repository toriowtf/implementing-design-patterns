package Strategy;
public class DeliveryContext {
    private DeliveryStrategy strategy;
    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }
    public void executeDelivery() {
        strategy.delivery();
    }
}
