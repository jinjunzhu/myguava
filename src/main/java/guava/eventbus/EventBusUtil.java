package guava.eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import guava.support.LocalThreadPoolExecutor;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class EventBusUtil {

    public static EventBus getEventBus(){
        return EventBusFactory.getInstance();
    }

    public static class EventBusFactory{
        private static EventBus eventBus = new AsyncEventBus(LocalThreadPoolExecutor.getExecutor());
        public static EventBus getInstance(){
            return eventBus;
        }
    }
}
