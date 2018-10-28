package javawhl.base.string;

/**
 * String、StringBuilder、StringBuffer
 * author:https://github.com/honglei92
 * time:2018/7/13
 */
public class StringBufferTest {
    private static String s;
    static StringBuffer stringBuffer = new StringBuffer();
    static StringBuilder stringBuilder = new StringBuilder();
    static long time0, time1, time2, time3;

    public static void main(String[] args) {
        time0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        time1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(i);
        }
        time2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
        }
        time3 = System.currentTimeMillis();
        System.out.println("1:" + (time1 - time0)
                + "\n2:" + (time2 - time1)
                + "\n2:" + (time3 - time2)
        );

    }
}
