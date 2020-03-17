package guava.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class MyObserver implements Observer {

    public void update(Observable o, Object arg) {
        if (o instanceof MyObservable){
            System.out.println(arg);
        }

    }
}
