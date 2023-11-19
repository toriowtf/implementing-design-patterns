import Adapter.*;
import Decorator.*;
import Factory.*;
import Observer.*;
import Singleton.*;
import Strategy.*;


public class Main {
    public static void main(String[] args) {

        //Singleton
        User user = User.getInstance("assan");
        System.out.println("Welcome, " + User.name.toUpperCase() + ".");

        //Strategy
        DeliveryContext strategy = new DeliveryContext();
        strategy.setDeliveryStrategy(new TrainDelivery());
        strategy.executeDelivery();

        //Factory
        TransportDialog trainDialog = new TrainDialog();
        TransportFactory train = trainDialog.createVehicle();
        train.orderVehicle();

        //Decorator
        DeliveryUpgrades basicDelivery = new DefaultDelivery();
        DeliveryUpgrades giftWrapDelivery = new GiftWrapDecorator(basicDelivery);
        DeliveryUpgrades expressGiftWrapDelivery = new ExpressDeliveryDecorator(giftWrapDelivery);
        expressGiftWrapDelivery.deliver("Wolf St.");

        //Observer
        DeliveryManager deliveryManager = new DeliveryManager();
        Customer customer = new Customer(User.name);
        deliveryManager.addObserver(customer);
        deliveryManager.setStatus("Package is being shipped");

        //Adapter
        Ship ship = new Ship();
        DeliveryStrategy shipAdapter = new ShipAdapter(ship);
        shipAdapter.delivery();

    }
}
