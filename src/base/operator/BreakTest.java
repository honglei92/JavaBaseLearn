package base.operator;

/**
 * 带标签的break
 *
 * @author Administrator
 */
public class BreakTest {
    public static void main(String[] args) {
        // way1 标签在外层，结束循环
        here:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue here;
                    // break;
                }
                System.out.println("i=" + i + ";j=" + j);
            }
        }
        // way2
        for (int i = 0; i < 3; i++) {
            here:
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue here;
                    // break;
                }
                System.out.println("w2 i=" + i + ";j=" + j);
            }
        }
    }

}
