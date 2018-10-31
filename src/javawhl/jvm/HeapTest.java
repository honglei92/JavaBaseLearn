package javawhl.jvm;

/**
 * 测试垃圾回收
 *
 * @author Administrator
 */
public class HeapTest {
    public static void main(String[] args) {
        // System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        localvarGc1();
    }

    private static void localvarGc1() {
        byte[] a = new byte[3 * 1024 * 1024];
        System.gc();
        printFreeMemory();
        printTotalMemory();

        a = null;
        System.gc();
        printFreeMemory();
        printTotalMemory();

        a = new byte[20 * 1024 * 1024];
        System.gc();
        printFreeMemory();
        printTotalMemory();

        byte[] b = new byte[30 * 1024 * 1024];
        b = null;
        System.gc();
        printFreeMemory();
        printTotalMemory();
    }

    private static void printTotalMemory() {
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M\n");
    }

    private static void printFreeMemory() {
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
    }
}
