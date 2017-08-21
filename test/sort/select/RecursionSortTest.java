package  test.sort.select;

import test.TestInterface;
import sort.select.*;
import java.util.Arrays;

public class RecursionSortTest implements TestInterface{

    public void test(){
        RecursionSort rs = new RecursionSort();
        int[] a = new int[]{8,10,1,4,6,3,2,9,7,5};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(a));
        rs.sort(a);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(a));
    }
}
