package javawhl.juc.chapter5;

import java.util.Vector;

public class Chapter5_1 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 1000; i++) {
            vector.add("我的名次:" + i);
        }
//        System.out.println(getLast(vector));
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                deleteLast(vector);
                System.out.println("size:" + vector.size());
            }).start();
        }
    }

    private static Object getLast(Vector vector) {
        int lastIndex = vector.size() - 1;
        return vector.get(lastIndex);
    }

    private static void deleteLast(Vector vector) {
        synchronized (vector) {
            int lastIndex = vector.size() - 1;
            vector.remove(lastIndex);
        }
    }

}
