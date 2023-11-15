package Adapter;

import Strategy.DeliveryStrategy;

public class ShipAdapter implements DeliveryStrategy {
    private Ship ship;
    public ShipAdapter(Ship ship) {
        this.ship = ship;
    }
    @Override
    public void delivery() {
        ship.ship();
    }
}
