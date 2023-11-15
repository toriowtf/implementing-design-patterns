package Observer;

public class Customer implements DeliveryObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Package status: " + status);
    }
}
