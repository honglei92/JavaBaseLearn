package javawhl.juc.chapter3;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class Chapter3_1_3 {

    private int value;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }
}
