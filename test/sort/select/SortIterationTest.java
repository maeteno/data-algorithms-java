package  test.sort.select;

import test.TestInterface;
import sort.select.*;
import java.util.Arrays;

public class SortIterationTest implements TestInterface{

    public void test(){
        SortIteration si = new SortIteration();
        int[] a = new int[]{8,10,1,4,6,3,2,9,7,5};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(a));
        si.sort(a);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(a));
    }
}
