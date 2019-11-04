package javawhl.collection.map;


import util.L;
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
        mHashCode();
//        test();
    }

    /**
     * hashcode测试
     */
    private static void mHashCode() {
        String a = "123";
        String b = "123";
        Integer c = 123;
        Object o = new Object();
        L.p(a.hashCode() + "");
        L.p(b.hashCode() + "");
        L.p(o.hashCode() + "");
        L.p(o.toString());
        L.p(Integer.toHexString(o.hashCode()));
        L.p(c.hashCode() + "");
        Computer mComputer = new Computer();
        L.p((mComputer.hashCode() + ""));
        L.p((new Computer().hashCode() + ""));
        L.p((new Computer().hashCode() + ""));
        L.p((new Computer().hashCode() + ""));
    }

    private static void test() {
//            Map<String, String> map = new HashMap<>(2 ^ 4, 0.75f);
        Map<String, String> map = new HashMap<>(16, 0.75f);
        S.showNow();
        for (int i = 0; i < 100000; i++) {
            map.put(i + "", "王宏雷");
        }
        S.showNow();
    }
}
