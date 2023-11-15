package Decorator;

public abstract class UpgradeDecorator implements DeliveryUpgrades {

    protected DeliveryUpgrades decoratedDelivery;

    public UpgradeDecorator(DeliveryUpgrades decoratedDelivery) {
        this.decoratedDelivery = decoratedDelivery;
    }

    public void deliver(String address) {
        decoratedDelivery.deliver(address);
    }
}
