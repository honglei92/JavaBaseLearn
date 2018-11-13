package javawhl.juc.chapter3;

public class Chapter3_1_2 {
     static int number = 100;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            buy();
        }
    }

    private synchronized static void buy() {
        new Thread(() -> {
            number--;
            System.out.println("剩余票数:" + number);
        }).start();
    }

}
