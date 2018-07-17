package datastructure.sort;

import util.L;

import java.util.Arrays;

/**
 * 排序算法
 * author:https://github.com/honglei92
 * time:2018/7/17
 */
public class SortTest {
    //    static int[] mArrays = {1, 6, 3, 9, 5};
    static int[] mArrays = {9, 6, 5, 3, 1, 10, 13, 2};

    public static void main(String[] args) {
//        bubbleSort();
        quickTest();

    }

    private static void quickTest() {
        quickSort(mArrays, 0, mArrays.length - 1);
        L.p(Arrays.toString(mArrays));

    }

    /**
     * 快速排序
     */
    private static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return;
        }
        int boundary = boundary(array, startIndex, endIndex);
        quickSort(array, startIndex, boundary - 1);
        quickSort(array, boundary + 1, endIndex);
    }

    private static int boundary(int[] array, int startIndex, int endIndex) {
        //9
        int standard = array[startIndex];
        //0
        int leftIndex = startIndex;
        //7
        int rightIndex = endIndex;
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && array[rightIndex] >= standard) {
                rightIndex--;
            }
            array[leftIndex] = array[rightIndex];
            while (leftIndex < rightIndex && array[leftIndex] <= standard) {
                leftIndex++;
            }
            array[rightIndex] = array[leftIndex];
            L.p(Arrays.toString(mArrays));
        }
        array[leftIndex] = standard;
        return leftIndex;
    }

    /**
     * 冒泡排序 每次把最大的放到最后
     */
    private static void bubbleSort() {
        for (int i = 0; i < mArrays.length; i++) {
            for (int i1 = 0; i1 < mArrays.length - 1 - i; i1++) {
                if (mArrays[i1] > mArrays[i1 + 1]) {
                    int temp = mArrays[i1 + 1];
                    mArrays[i1 + 1] = mArrays[i1];
                    mArrays[i1] = temp;
                }
            }
            L.p(Arrays.toString(mArrays));
        }
    }
}
