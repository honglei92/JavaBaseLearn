package builtinlib.map;

import util.L;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * author:https://github.com/honglei92
 * time:2018/7/13
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Map<String, String> mMap = new ConcurrentHashMap<>();
        mMap.put("name", "whl");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    mMap.put("name", "honglei92");
                    L.p(mMap.get("name"));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    mMap.put("name", "wanghonglei");
                    L.p(mMap.get("name"));
                }
            }
        }).start();

    }
}
