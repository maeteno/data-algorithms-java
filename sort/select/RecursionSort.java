package sort.select;

public class RecursionSort{

    public int[] sort(int[] a){
        return sort(a,0,a.length);
    }

    private int[] sort(int[] a,int first,int last){
        if(first < last){
            int indexOfNextSmallest = getIndexOfSmallest(a, first, last);
            if (first != indexOfNextSmallest) {
                swap(a, first, indexOfNextSmallest);
            }
            sort(a,first + 1,last);
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

    private void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
