package sort.insert;

import java.util.Arrays;

public class InsertSort{

    public int[] sort(int[] a){
        insertSort(a,1);

        return a;
    }

    public void insertSort(int[] a, int index){
        if(index < a.length) {

            // 如果当前位置的元素小于前面一个元素，说明这个元素是无序的位置
            if (a[index - 1] > a[index]) {
                carding(a, index);
                System.out.println(Arrays.toString(a));
            }

            insertSort(a, index + 1);
        }
    }

    /**
     * @param a
     * @param index
     */
    public void carding(int[] a, int index) {
        int tmp = a[index];
        int insertIndex = 0;

        // 查找到无序元素插入的位置
        for (int i = index; i > 0; i--) {
            if (a[i] >= tmp && a[i - 1] < tmp) {
                insertIndex = i;
                break;
            }
        }

        // 将元素后移，空出插入的位置
        for (int i = index; i > insertIndex; i--) {
            a[i] = a[i - 1];
        }

        a[insertIndex] = tmp;
    }
}