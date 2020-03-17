package guava.javaobserver;

import java.util.Observable;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class MyObservable extends Observable {

    @Override
    public void notifyObservers(Object message){
        super.setChanged();
        super.notifyObservers(message);
    }

}
