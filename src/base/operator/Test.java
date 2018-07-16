package base.operator;

import util.L;

public class Test {
    public static void main(String[] args) {
//        testAdd();
//        test();
//        testEquals();
        testBitOperationTest();
    }

    /**
     * 位运算
     */
    private static void testBitOperationTest() {
        //101
        int a = 5;
        //100
        int b = 4;
        //1 1得1,1 0得0
        L.p((a & b) + "");
        //有1得1，没1得0
        L.p((a | b) + "");
        //0变1,1变0
        L.p((~a) + "");
        L.p((~b) + "");
        //相同为0，不同为1
        L.p((a ^ b) + "");

    }

    /**
     * ==和equals的区别
     */
    private static void testEquals() {
        int a = 3;
        Integer wrapperA = 3;
        Integer wrapperB = new Integer(3);
        Integer wrapperC = new Integer(3);
        L.p(String.valueOf(a == 3));
        L.p(String.valueOf(wrapperA.equals(3)));
        L.p(String.valueOf(wrapperA == 3));
        L.p(String.valueOf(wrapperB.equals(3)));
        L.p(String.valueOf(wrapperB == 3));
        L.p(String.valueOf(wrapperB == wrapperC));
        L.p(String.valueOf(wrapperB.equals(wrapperC)));
    }

    /**
     * ++a a++
     */
    private static void testAdd() {
        int a = 2;
        ++a;
        System.out.println(a); // +2
        --a;
        System.out.println(a);// -1
        a++;
        System.out.println(a);// +1
        a--;
        System.out.println(a);// -1
        int b = 5;
        System.out.println(b++);// c=b++;c==5;b==6
        System.out.println(b--);// c=b--;c==6;b==5
        System.out.println(++b);// c=++b;c==6;b==6
        System.out.println(--b);// c=--b;c==5;b=5
        System.out.println(b);// b==5
    }

    /**
     * 2的n次方
     */
    private static void test() {
        L.p(((1 << 5) + ""));
    }
}
