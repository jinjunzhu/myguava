package guava.support;

import java.util.concurrent.*;

/**
 * @author jinjunzhu
 * @date 2020/3/16
 */
public class LocalThreadPoolExecutor {

    public static ExecutorService getExecutor(){
        return ThreadPoolFactory.executor;
    }

    public static class ThreadPoolFactory{
        private static final int CPU_NUM = Runtime.getRuntime().availableProcessors();
        public static ExecutorService executor = new ThreadPoolExecutor(5, CPU_NUM + 1, 10L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<>(200));
    }
}
