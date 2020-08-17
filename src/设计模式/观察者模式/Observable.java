package 设计模式.观察者模式;

/**
 * 抽象被观察者
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notify(String message);
}
