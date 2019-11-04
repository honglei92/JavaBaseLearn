package javawhl.juc.chapter5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Chapter5_6 {
    private final Set<Integer> set = new HashSet<>();
    public static void main(String[] args){
    }

    public synchronized void add(Integer i) {
        set.add(i);
    }

    public synchronized void remove(Integer i) {
        set.remove(i);
    }

    public void addTenThings() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            add(i);
            System.out.println("DEBUG: added ten elements to" + set);
        }
    }
}
