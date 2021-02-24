package javawhl.jvm;

import java.util.ArrayList;

/**
 * 堆栈溢出
 */
public class JVMTest2 {
//    public static Byte[] a = new Byte[1024];//1kB

    public static void main(String[] args) {
//        heapoom();
        stackoom();
    }

    private static void stackoom() {
        new JVMTest2().test();
    }

    /**
     * 栈溢出
     */
    private void test() {
        test();
    }

    /**
     * 堆溢出
     */
    private static void heapoom() {
        ArrayList<JVMTest2> list = new ArrayList<>();
        while (true)
            list.add(new JVMTest2());
    }
}
