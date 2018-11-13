package javawhl.juc.chapter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5_5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = Collections.synchronizedList(list);
        for (int i = 0; i < 10000; i++) {
            list.add("序号：" + i);
        }
        for (String name : list) {
            System.out.println(name);
        }
    }
}
