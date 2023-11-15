package Decorator;

public class DefaultDelivery implements DeliveryUpgrades {
    @Override
    public void deliver(String address) {
        System.out.println("Delivering to " + address);
    }
}
