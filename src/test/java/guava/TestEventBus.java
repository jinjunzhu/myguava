package guava;

import com.google.common.eventbus.EventBus;
import guava.eventbus.AObserver;
import guava.eventbus.BObserver;
import guava.eventbus.EventBusUtil;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class TestEventBus{

    public static void main(String[] args){
        EventBus eventBus = EventBusUtil.getEventBus();
        eventBus.register(new AObserver());
        eventBus.register(new BObserver());

        for (int j = 0; j < 2; j ++){
            eventBus.post("hi, observer" + j);
        }
    }
}
