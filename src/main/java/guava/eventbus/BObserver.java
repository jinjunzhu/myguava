package guava.eventbus;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class BObserver {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Subscribe
    public void handleMessage(String msg){
        logger.info("b obsesrver receive message:{}", msg);
    }
}
