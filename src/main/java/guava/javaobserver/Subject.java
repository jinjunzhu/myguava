package guava.javaobserver;

import java.util.Observable;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class Subject {

    private Observable observable = new MyObservable();

    public void registerObserver(MyObserver observer) {
        observable.addObserver(observer);
    }

    public void removeObserver(MyObserver observer) {
        observable.deleteObserver(observer);
    }

    public void notifyObservers(String message) {
        observable.notifyObservers(message);
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        MyObserver observer = new MyObserver();
        subject.registerObserver(observer);
        subject.notifyObservers("hi, I am subject Observable");
    }

}

