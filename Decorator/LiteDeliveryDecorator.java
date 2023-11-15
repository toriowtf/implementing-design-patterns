package Decorator;

public class LiteDeliveryDecorator extends UpgradeDecorator {

    public LiteDeliveryDecorator(DeliveryUpgrades decoratedDelivery) {
        super(decoratedDelivery);
    }

    public void deliver(String address) {
        super.deliver(address);
        System.out.println("Lite delivery");
    }
}
