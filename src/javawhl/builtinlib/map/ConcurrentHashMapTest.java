package javawhl.builtinlib.map;

import util.L;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * author:https://github.com/honglei92
 * time:2018/7/13
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        test();
//        testHashMap();
    }

    private static void testHashMap() {
        Map<String, String> mHashMap = new HashMap<>();
        mHashMap.put("name", "whl");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i == 1) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    mHashMap.put("name", "honglei92" + i);
                    L.p(i + mHashMap.get("name"));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    mHashMap.put("name", "wanghonglei" + i);
                    L.p(i + mHashMap.get("name"));
                }
            }
        }).start();

    }

    private static void test() {
        Map<String, String> mMap = new ConcurrentHashMap<>();
        mMap.put("name", "whl");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i == 1) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    mMap.put("name", "honglei92" + i);
                    L.p("a" + mMap.get("name"));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    mMap.put("name", "wanghonglei" + i);
                    L.p("b" + mMap.get("name"));
                }
            }
        }).start();

    }
}
