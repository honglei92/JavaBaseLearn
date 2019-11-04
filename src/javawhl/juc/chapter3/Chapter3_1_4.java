package javawhl.juc.chapter3;

public class Chapter3_1_4 {

    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}

