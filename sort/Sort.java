package sort;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] a = new int[]{7, 1, 2, 3, 8, 10, 1, 4, 6, 3, 2, 9, 7, 5};

        System.out.println(Arrays.toString(a));

        System.out.prinln("")
        int[] b = bubbleSort(a);
        System.out.println(Arrays.toString(b));

        int[] s = selectSort(a);
        System.out.println(Arrays.toString(s));

        int[] i = insertSort(a);
        System.out.println(Arrays.toString(i));

        int[] sh = shellSort(a);
        System.out.println(Arrays.toString(sh));
    }

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        int[] a = arr.clone();
        int len = a.length;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i; j++) {
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }

        return a;
    }

    /**
     * 选择排序
     *
     * @param arr
     * @return
     */
    public static int[] selectSort(int[] arr) {
        int[] a = arr.clone();
        int len = a.length;

        for (int i = 0; i < len - 1; i++) {
            int small = a[i];
            int index = i;

            for (int j = i + 1; j < len; j++) {
                if (small > a[j]) {
                    small = a[j];
                    index = j;
                }
            }

            if (index != i) {
                int tmp = a[index];
                a[index] = a[i];
                a[i] = tmp;
            }
        }

        return a;
    }

    /**
     * 插入排序
     *
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {
        int[] a = arr.clone();

        for (int i = 1; i < a.length; i++) {
            // 判断数据是否有序
            if (a[i] < a[i - 1]) {
                int tmp = a[i];
                int index = 0;

                // 定位数据插入的位置
                for (int j = i; j > 0; j--) {
                    if (a[j] > tmp && a[j - 1] <= tmp) {
                        index = j;
                    }
                }

                // 移动数据
                for (int k = i; k > index; k--) {
                    a[k] = a[k - 1];
                }

                // 插入数据
                a[index] = tmp;
            }
        }

        return a;
    }

    /**
     * 希尔排序
     * @param a
     * @return
     */
    public static int[] shellSort(int[] a) {
        int[] arr = a.clone();
        int gap = 1, i, j, len = arr.length;
        int temp;
        while (gap < len / 3) {
            gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
        }
        for (; gap > 0; gap /= 3){
            for (i = gap; i < len; i++) {
                temp = arr[i];
                for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap)
                    arr[j + gap] = arr[j];
                arr[j + gap] = temp;
            }
        }

        return arr;
    }
}