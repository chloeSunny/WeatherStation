package design.Observer;

/**
 * Created by Administrator on 2017/3/4.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
