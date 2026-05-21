public interface ObservableMesa {

    void addObserver(ElectionObserver observer);
    void removeObserver(ElectionObserver observer);
    void notifyObservers(String event);
}
