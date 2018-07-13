package base.exception;

import java.util.Timer;
import java.util.TimerTask;

/**
 * author:https://github.com/honglei92
 * time:2018/7/12
 */
public class ExceptionTest {
    static byte[] bytes;
    private static String mCup = "StartBark";

    public static void main(String[] args) {
//        1.
//        try {
//            exception();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        2.
//        test1();

//        3.
        error();


    }

    /**
     * error实践
     */
    private static void error() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                printFreeMemory();
                printTotalMemory();
            }
        }, 0, 10);
        for (int i = 0; i < 1; i++) {
            //对空间内存溢出
            bytes = new byte[20 * 1024 * 1024];
        }
        System.out.println("finish");
        timer.cancel();
        /*File file = new File("D:/123.txt");
        System.out.println(file.getName());*/
    }

    /**
     * 异常链实践
     *
     * @throws RuntimeException
     */
    private static void test1() throws RuntimeException {
        try {
            test2();
        } catch (NullPointerException e) {
            //捕获test3的异常然后作为参数放在test1的捕获参数中
            throw new RuntimeException("运行时异常", e);
        }
    }

    private static void test2() {
        test3();
    }

    private static void test3() {
        throw new NullPointerException("空指针异常");
    }

    /**
     * throw/throws实践
     *
     * @throws Exception
     */
    private static void exception() throws Exception {
        mCup = null;
        try {
            System.out.println(mCup.length());
        } catch (Exception e) {
            //抛出自定义异常
            throw new Exception(e.toString() + "||NullPointer");
        } finally {
            System.out.println("我是finally");
        }
        try {
            System.out.println(2 / 0);
        } catch (Exception e) {
            //抛出自定义异常
            throw new Exception(e.toString() + "||Arithmetic");
        }
        System.out.println("异常之后执行");
    }

    private static void printFreeMemory() {
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
    }

    private static void printTotalMemory() {
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M\n");
    }
}
