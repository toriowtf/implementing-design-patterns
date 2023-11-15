# Delivery Service
This Java project implements a delivery system using various design patterns. The main design patterns used in this project are Singleton, Strategy, Factory, Decorator, Observer, and Adapter.

## Table of Contents
1. [Singleton](#Singleton)
2. [Strategy](https://github.com/toriowtf/sdpfinal/tree/master/Strategy)
3. [Factory](https://github.com/toriowtf/sdpfinal/tree/master/Factory)
4. [Decorator](https://github.com/toriowtf/sdpfinal/tree/master/Decorator)
5. [Observer](https://github.com/toriowtf/sdpfinal/tree/master/Observer)
6. [Adapter](#Adapter)

## Singleton
The User class is implemented as a Singleton, ensuring that there is only one instance of the user throughout the application's lifecycle.

## Strategy
The delivery strategies are implemented using the Strategy pattern. The DeliveryContext class allows you to set different delivery strategies, such as TrainDelivery and AirDelivery, which can be executed dynamically.

## Factory
The Factory pattern is employed to create different types of transport vehicles. TrainFactory and AirFactory implement the TransportFactory interface, providing a way to order vehicles for delivery.

## Decorator
The Decorator pattern is used for enhancing the delivery process. UpgradeDecorator is an abstract class that serves as the base for concrete decorators like ExpressDeliveryDecorator, GiftWrapDecorator, and LiteDeliveryDecorator.

## Observer
The Observer pattern is implemented for tracking the delivery status. DeliveryStatus maintains a list of observers (in this case, customers) and notifies them when the status changes.

## Adapter
The Adapter pattern is utilized with the ShipAdapter class, allowing the Ship class to be used as a DeliveryStrategy. This demonstrates how different delivery systems can be adapted to the common DeliveryStrategy interface.

## Main Class
The Main class serves as the entry point to the application. It demonstrates the use of the implemented design patterns by creating instances of the classes and showcasing their interactions.
