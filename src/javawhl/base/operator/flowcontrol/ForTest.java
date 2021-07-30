package javawhl.base.operator.flowcontrol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import util.L;

/**
 * author:https://github.com/honglei92 time:2018/7/13
 */
public class ForTest {
    public static void main(String[] args) {
        // for (int i = 0; i < 1000000; i++) {
        // L.p("wanghonglei love renmingyue forever");
        // }
        int[] arr = { 1, 3, 5, 7, 9 };
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i] + ",");
        }
        Collection<Integer> collection = new HashSet<Integer>();

        for (int i : arr) {
            // System.out.println(i + "");
            collection.add(i);
        }
        for (Integer integer : collection) {
            // System.out.println(integer + ".");
        }
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
