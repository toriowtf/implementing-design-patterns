# Delivery Service
Welcome to the Delivery Service project! This Java application implements a flexible delivery system using various design patterns. Explore the documentation below to understand the key design patterns employed in the project and how they contribute to creating a robust and extensible delivery service. This Java project implements a delivery system using various design patterns. The main design patterns used in this project are [Singleton](https://github.com/toriowtf/sdpfinal/tree/master/Singleton), [Strategy](https://github.com/toriowtf/sdpfinal/tree/master/Strategy), [Factory](https://github.com/toriowtf/sdpfinal/tree/master/Factory), [Decorator](https://github.com/toriowtf/sdpfinal/tree/master/Decorator), [Observer](https://github.com/toriowtf/sdpfinal/tree/master/Observer), and [Adapter](https://github.com/toriowtf/sdpfinal/tree/master/Adapter).

## UML
![UML](UML.png)

## Table of Contents
1. [Singleton](#Singleton)
2. [Strategy](#Strategy)
3. [Factory](#Factory)
4. [Decorator](#Decorator)
5. [Observer](#Observer)
6. [Adapter](#Adapter)
7. [Main Class](#Main)

## Singleton
The `User` class is implemented as a Singleton, ensuring that there is only one instance of the user throughout the application's lifecycle.
```java
User user = User.getInstance("assan");
```

## Strategy
The delivery strategies are implemented using the Strategy pattern. The `DeliveryContext` class allows you to set different delivery strategies, such as `TrainDelivery` and `AirDelivery`, which can be executed dynamically.
```java
DeliveryContext strategy = new DeliveryContext();
strategy.setDeliveryStrategy(new TrainDelivery());
strategy.executeDelivery();
```

## Factory
The Factory pattern is employed to create different types of transport vehicles. `TrainFactory` and `AirFactory` implement the `TransportFactory` interface, providing a way to order vehicles for delivery.
```java
TransportDialog trainDialog = new TrainDialog();
TransportFactory train = trainDialog.createVehicle();
train.orderVehicle();
```

## Decorator
The Decorator pattern is used for enhancing the delivery process. `UpgradeDecorator` is an abstract class that serves as the base for concrete decorators like `ExpressDeliveryDecorator`, `GiftWrapDecorator`, and `LiteDeliveryDecorator`.
```java
DeliveryUpgrades basicDelivery = new DefaultDelivery();
DeliveryUpgrades giftWrapDelivery = new GiftWrapDecorator(basicDelivery);
DeliveryUpgrades expressGiftWrapDelivery = new ExpressDeliveryDecorator(giftWrapDelivery);
expressGiftWrapDelivery.deliver("Wolf St.");
```

## Observer
The Observer pattern is implemented for tracking the delivery status. `DeliveryStatus` maintains a list of observers (in this case, customers) and notifies them when the status changes.
```java
DeliveryStatus deliveryStatus = new DeliveryStatus();
Customer customer = new Customer(User.name);
deliveryStatus.addObserver(customer);
deliveryStatus.setStatus("Package is being shipped");
```

## Adapter
The Adapter pattern is utilized with the `ShipAdapter` class, allowing the Ship class to be used as a `DeliveryStrategy`. This demonstrates how different delivery systems can be adapted to the common `DeliveryStrategy` interface.
```java
Ship ship = new Ship();
DeliveryStrategy shipAdapter = new ShipAdapter(ship);
shipAdapter.delivery();
```

## Main
The `Main` class serves as the entry point to the application. It demonstrates the use of the implemented design patterns by creating instances of the classes and showcasing their interactions.
```java
import Adapter.Ship;
import Adapter.ShipAdapter;
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
        DeliveryStatus deliveryStatus = new DeliveryStatus();
        Customer customer = new Customer(User.name);
        deliveryStatus.addObserver(customer);
        deliveryStatus.setStatus("Package is being shipped");

        //Adapter
        Ship ship = new Ship();
        DeliveryStrategy shipAdapter = new ShipAdapter(ship);
        shipAdapter.delivery();

    }
}
```
