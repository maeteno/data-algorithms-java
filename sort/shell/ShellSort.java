package sort.shell;

import java.util.Arrays;

public class ShellSort{

    public void sort(int[] arr) {
        int gap = 1, i, j, len = arr.length;
        int temp;
        while (gap < len / 3) {
            System.out.println(gap);
            gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
            System.out.println(gap);
        }
        for (; gap > 0; gap /= 3){
            for (i = gap; i < len; i++) {
                temp = arr[i];
                for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap)
                    arr[j + gap] = arr[j];
                arr[j + gap] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
