package javawhl.juc.chapter1;

/**
 * 模拟火车票抢票
 */
public class test1_2 {
    static int ticket = 150;

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    sold(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

//        static synchronized void sold(int finalI) throws InterruptedException {
    static void sold(int finalI) throws InterruptedException {
        if (ticket > 0) {
            ticket--;
            System.out.println(finalI + "买到票了*********************************************" + (ticket));
            Thread.sleep(20);
        } else {
            System.out.println(finalI + "没抢到票");
        }
    }
}
