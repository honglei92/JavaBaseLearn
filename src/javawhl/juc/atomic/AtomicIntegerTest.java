package javawhl.juc.atomic;

import util.L;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * author:https://github.com/honglei92
 * time:2018/7/17
 * 原子类
 */
public class AtomicIntegerTest {
    static int a = 1;
    static AtomicInteger aAtomic = new AtomicInteger(1);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    a += 1;
//                    L.p(a + "");
                    aAtomic.getAndIncrement();
                    L.p(aAtomic + "");
                }
            }).start();
        }
    }
}
