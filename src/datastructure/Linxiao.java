package datastructure;

/**
 * 判断一个数是否是3的n次方
 *
 * @author Administrator
 */
public class Linxiao {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int c = 27;
        isTime(a);
        isTime(b);
        isTime(c);
    }

    private static void isTime(int a) {
        int num = a;
        boolean result = false;
        while (a % 3 == 0) {
            a = a / 3;
            if (a == 1) {
                result = true;
            }
        }
        System.out.println(num + ":" + result);
    }

}
