package javawhl.juc.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
        //线程池使用方式
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 3, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5), Executors.defaultThreadFactory());
        for (int i = 0; i < 8; i++) {
            pool.execute(new Task(i));
        }
    }

    
}