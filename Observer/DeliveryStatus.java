package Observer;
import java.util.ArrayList;
import java.util.List;
public class DeliveryManager {
    private List<DeliveryObserver> observers = new ArrayList<>();
    private String status;

    public void addObserver(DeliveryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(DeliveryObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (DeliveryObserver observer : observers) {
            observer.update(status);
        }
    }
}
