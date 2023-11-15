package Decorator;

public class GiftWrapDecorator extends UpgradeDecorator {
    public GiftWrapDecorator(DeliveryUpgrades decoratedDelivery) {
        super(decoratedDelivery);
    }

    public void deliver(String address) {
        super.deliver(address);
        System.out.println("Package is gift-wrapped");
    }
}
