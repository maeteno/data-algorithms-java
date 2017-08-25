package sort.select;

/**
 * 排序规则为： 遍历序列的每个元素，找到最小的元素，并放在最前面，然后遍历剩下的找到最小的元素。遍历查找剩下序列最小的元素。
 */
public class SortIteration {

    /**
     * 排序
     *
     * @param a
     * @return
     */
    public int[] sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, i, n);
            if (i != indexOfNextSmallest) {
                swap(a, i, indexOfNextSmallest);
            }
        }
        return a;
    }

    /**
     * 获取最小的元素下标
     *
     * @param a
     * @return int
     */
    private int getIndexOfSmallest(int[] a, int first, int last) {
        int smallestIndex = first;
        int smallest = a[first];

        for (int index = first + 1; index < last; index++) {
            if (a[index] < smallest) {
                smallestIndex = index;
                smallest = a[index];
            }
        }

        return smallestIndex;
    }

    /**
     * 交换两个元素的位置
     *
     * @param a
     * @param i
     * @param j
     */
    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
