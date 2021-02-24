package javawhl.jvm;

public class ByteCodeTest {
    public static void main(String[] args) {
        System.out.println(compute(1, 2));
    }

    private static int compute(int i, int i1) {
        int a = i;
        int b = i1;
        int c = (a + b) * 10;
        return c;
    }
}
