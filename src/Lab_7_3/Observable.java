package Lab_7_3;

public interface Observable<T> {
    void addObserver(Observer<T> observer);
    void setValue(T value);
}
