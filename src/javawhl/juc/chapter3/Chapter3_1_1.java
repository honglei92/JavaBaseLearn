package javawhl.juc.chapter3;



public class Chapter3_1_1 {
    private static boolean isReady;
    private static int number;

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        isReady = true;
    }

    public static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!isReady)
                Thread.yield();
            System.out.println(number);
        }
    }


}
