package 设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Subscription implements Observable {
    private List<Observer> mObserverList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        mObserverList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        mObserverList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : mObserverList){
           observer.update(message);
        }
    }
}
