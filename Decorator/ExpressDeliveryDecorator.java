package Decorator;

public class ExpressDeliveryDecorator extends UpgradeDecorator {
    public ExpressDeliveryDecorator(DeliveryUpgrades decoratedDelivery) {
        super(decoratedDelivery);
    }

    public void deliver(String address) {
        super.deliver(address);
        System.out.println("Express delivery");
    }
}
