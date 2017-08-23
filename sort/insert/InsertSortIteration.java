package sort.insert;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSortIteration {
    public int[] sort(int[] a) {
        int len = a.length;

        for (int i = 1; i < len; i++) {
            if (a[i] > a[i - 1]) {
                continue;
            } else {
                carding(a, i);
            }
        }
        return a;
    }

    /**
     *
     * @param a
     * @param index
     */
    public void carding(int[] a, int index) {
        int tmp = a[index];
        int insertIndex = 0;
        for (int i = index; i > 0; i--) {
            if (a[i] >= tmp && a[i - 1] < tmp) {
                insertIndex = i;
                break;
            }
        }

        for (int i = index; i > insertIndex; i--) {
            a[i] = a[i - 1];
        }

        a[insertIndex] = tmp;
    }
}