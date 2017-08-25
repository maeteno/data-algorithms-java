package sort.bubble;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public void sort(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }


    public void bubble() {

    }

    private void swap(int[] a, int i ,int j) {
        int tmp = a[j];
        a[j] = a[i];
        a[i] = tmp;
    }
}