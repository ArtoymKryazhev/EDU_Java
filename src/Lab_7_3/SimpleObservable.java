package Lab_7_3;

class SimpleObservable<T> implements Observable<T> {
    private T value;
    private final java.util.List<Observer<T>> observers = new java.util.ArrayList<>();

    public T getValue() { return value; }

    @Override
    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    @Override
    public void setValue(T newValue) {
        this.value = newValue;
        for (Observer<T> observer : observers) {
            observer.onChanged(newValue);
        }
    }
}
