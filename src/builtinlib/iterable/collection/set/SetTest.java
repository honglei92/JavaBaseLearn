package builtinlib.iterable.collection.set;

import util.L;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 无序，不能下标索引
 * author:https://github.com/honglei92
 * time:2018/7/16
 */
public class SetTest {
    public static void main(String[] args) {
        String[] mArrays = {"10", "3", "10", "8", "10", "9" };
        L.p(Arrays.toString(mArrays));
        Set<String> mSet = new HashSet<>();
        for (int i = 0; i < mArrays.length; i++) {
            mSet.add(mArrays[i]);
        }
        L.p(Arrays.toString(mSet.toArray()));
    }

}
