package javawhl.juc.chapter1;

public class test1_1 {
    public static void main(String[] args) {
        UnsafeSequence unsafeSequence = new UnsafeSequence();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                unsafeSequence.getNext(0);
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                unsafeSequence.getNext(1);
            }
        }).start();
    }
}

class UnsafeSequence {
    private int value;

    public synchronized void getNext(int i) {
//    public  void getNext(int i) {
        value++;
        System.out.println(i + ":" + value);
    }
}
