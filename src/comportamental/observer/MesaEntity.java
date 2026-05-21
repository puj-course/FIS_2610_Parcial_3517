import java.util.ArrayList;
import java.util.List;
public class MesaEntity implements ObservableMesa {
    private List<ElectionObserver> observers;

    public MesaEntity() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(ElectionObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ElectionObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {

        for (ElectionObserver observer : observers) {
            observer.notifyEvent(event);
        }
    }

    public void closeVoting() {
        System.out.println("Mesa cerrada");
        notifyObservers(
            "La mesa ha cerrado votaciones"
        );
    }
}
