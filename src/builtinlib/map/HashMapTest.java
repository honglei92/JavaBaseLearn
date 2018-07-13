package builtinlib.map;


import util.S;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap实践
 *
 * @author Administrator
 */
public class HashMapTest {
    public static void main(String[] args) {
        S.showNow();
        for (int i = 0; i < 100000; i++) {
            Map<String, String> map = new HashMap<>(2 ^ 1, 1);
            map.put(i + "", "王宏雷");
        }
        S.showNow();
    }
}
