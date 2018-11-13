package javawhl.juc.chapter3;

import net.jcip.annotations.NotThreadSafe;

/**
 * 第三章、对象的共享
 * 1可见性
 * 失效数据
 * 非原子的64位操作
 * 枷锁与可见性
 * volatile变量
 */

@NotThreadSafe
public class Chapter3_1 {
    public static void main(String[] args) {
        Chapter3_1_3 mutabelnteger = new Chapter3_1_3();
        Chapter3_1_4 synchronizedInteger = new Chapter3_1_4();
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            new Thread(() -> {
//                mutabelnteger.setValue(finalI);
//                System.out.println(mutabelnteger.getValue());
                synchronizedInteger.setValue(finalI);
                System.out.println(synchronizedInteger.getValue());
            }).start();

        }
    }
}

